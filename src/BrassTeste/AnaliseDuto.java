import java.util.List;

class AnaliseDuto {
    List<Registro> registros;
    String coluna;

    AnaliseDuto(List<Registro> registros, String coluna) {
        this.registros = registros;
        this.coluna = coluna.trim();
    }

    int tempoOperacao() {
        long segundos = registros.stream()
                .filter(r -> r.getValor(coluna) > 1000)
                .count();
        return (int) (segundos / 3600);
    }

    int qntOperacoes() {
        boolean emOperacao = false;
        int cont = 0;

        for (Registro r : registros) {
            double v = r.getValor(coluna);
            if (v > 1000 && !emOperacao) {
                cont++;
                emOperacao = true;
            } else if (v <= 1000) {
                emOperacao = false;
            }
        }
        return cont;
    }

    double valorMax() {
        return registros.stream()
                .mapToDouble(r -> r.getValor(coluna))
                .max()
                .orElse(0);
    }

    String horarioUltrapassou() {
        for (Registro r : registros) {
            if (r.getValor(coluna) > 1500) return r.horario;
        }
        return "Nunca ultrapassou";
    }
}