package pl.javastart.algorithms.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DataFileScanner {
    public static int[] readFile(String path) throws FileNotFoundException {

        Scanner scanner = new Scanner(new File(path));

        List<Integer> dataList = new ArrayList<>();
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            Integer integer = Integer.parseInt(line);
            dataList.add(integer);
        }

        int[] dataArray = new int[dataList.size()];

        for (int i = 0; i < dataList.size(); i++) {
            dataArray[i] = dataList.get(i);
        }

        return dataArray;
    }
}
