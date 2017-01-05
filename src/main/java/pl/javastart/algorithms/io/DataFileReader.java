package pl.javastart.algorithms.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DataFileReader {
    public static int[] readFile(String path) throws IOException {

        int[] dataArray;
        FileReader fileReader = new FileReader(path);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        StringBuilder stringBuilder = new StringBuilder();
        String input;

        while ((input = bufferedReader.readLine()) != null) {
            stringBuilder.append(input);
            stringBuilder.append(",");
        }
        String[] split = stringBuilder.toString().split(",");
        dataArray = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            dataArray[i] = Integer.parseInt(split[i].trim());
        }

        bufferedReader.close();
        fileReader.close();

        return dataArray;
    }
}
