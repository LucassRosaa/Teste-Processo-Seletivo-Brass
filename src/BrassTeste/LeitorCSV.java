import java.util.List;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;


class LeitorCSV {
    static List<Registro> carregar(String caminho) {
        List<Registro> registros = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(new FileInputStream(caminho), StandardCharsets.UTF_8))) {

            String cabecalho = br.readLine();
            if (cabecalho == null) return registros;

            String[] colunas = cabecalho.split(";");
            String linha;

            while ((linha = br.readLine()) != null) {
                String[] partes = linha.split(";");
                Registro r = new Registro(partes[1]);

                for (int i = 2; i < partes.length; i++) {
                    String valorStr = partes[i].replace(".", "").replace(",", ".");
                    try {
                        double valor = Double.parseDouble(valorStr);
                        r.adicionarValor(colunas[i], valor);
                    } catch (NumberFormatException e) {
                        // ignora se não for número
                    }
                }
                registros.add(r);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return registros;
    }
}