import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.*;

class Registro {
    String horario;
    Map<String, Double> valores = new HashMap<>();

    Registro(String horario) {
        this.horario = horario;
    }

    void adicionarValor(String coluna, double valor) {
        valores.put(coluna.trim(), valor);
    }

    double getValor(String coluna) {
        return valores.getOrDefault(coluna.trim(), 0.0);
    }
}