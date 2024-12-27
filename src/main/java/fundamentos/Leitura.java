package fundamentos;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvException;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Leitura {
    public static void main(String[] args) throws IOException, CsvException {
        Reader leitor = Files.newBufferedReader(Paths.get("src/main/resources/dados/pessoas.csv"));
        CSVReader leitorCsv = new CSVReaderBuilder(leitor).withSkipLines(1).build();

        List<String[]> pessoas = leitorCsv.readAll();
        for(String[] pessoa: pessoas){
            System.out.println("Nome: " + pessoa[0] + " - Idade: " + pessoa[1] + " - E-mail: " + pessoa[2]);
        }
    }
}
