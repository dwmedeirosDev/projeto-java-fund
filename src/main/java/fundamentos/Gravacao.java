package fundamentos;

import com.opencsv.CSVWriter;

import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Gravacao {
    public static void main(String[] args) throws IOException {
        String[] cabecalho = {"Nome", "Idade", "Celular"};

        List<String[]> linhas = new ArrayList<>();
        linhas.add(new String[]{"Beatriz", "29", "21 982916501"});
        linhas.add(new String[]{"João", "35", "21 982916502"});
        linhas.add(new String[]{"Fernanda", "21", "21 982916503"});
        linhas.add(new String[]{"David", "18", "21 982916504"});

        Writer escritor = Files.newBufferedWriter(Paths.get("src/main/resources/logs/clientes.csv"));
        CSVWriter escritorCSV = new CSVWriter(escritor);

        escritorCSV.writeNext(cabecalho);
        escritorCSV.writeAll(linhas);

        escritorCSV.flush();
        escritor.close();
    }
}