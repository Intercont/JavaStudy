package testes;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class RemoverLinhasDuplicadas {
    public static void main(String[] args) throws IOException {
        RemoverLinhasDuplicadas removerLinhasDuplicadas = new RemoverLinhasDuplicadas();
        removerLinhasDuplicadas.stripDuplicatesFromFile("/home/intercont/VRProjects/splitMegaWhitelist/Carga Whitelist 17-03-2021/testes/carga17-03-2021_sem_duplicados_v2.csv");
    }

    public void stripDuplicatesFromFile(String filename) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        Set<String> lines = new HashSet<String>(10000000); // maybe should be bigger
        String line;
        while ((line = reader.readLine()) != null) {
            lines.add(line);
        }
        reader.close();
        BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
        for (String unique : lines) {
            writer.write(unique);
            writer.newLine();
        }
        writer.close();
    }
}
