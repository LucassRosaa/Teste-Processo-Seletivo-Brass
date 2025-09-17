import java.util.List;

public class Main {
    public static void main(String[] args) {
        String caminho = "TesteEstagio.csv";
        String coluna = "Vazao, descarga da EB"; // cuidado com acento!

        List<Registro> registros = LeitorCSV.carregar(caminho);
        AnaliseDuto analise = new AnaliseDuto(registros, coluna);

        System.out.println("Coluna: " + coluna);
        System.out.println("Horas de operação: " + analise.tempoOperacao());
        System.out.println("Qtd de operações: " + analise.qntOperacoes());
        System.out.println("Valor máximo: " + analise.valorMax());
        System.out.println("Primeiro horário > 1500: " + analise.horarioUltrapassou());
    }
}