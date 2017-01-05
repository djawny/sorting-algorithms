package pl.javastart.algorithms;

import pl.javastart.algorithms.io.DataFileScanner;
import pl.javastart.algorithms.sorting.BubbleSort;
import pl.javastart.algorithms.sorting.SortingAlgorithm;

import java.io.FileNotFoundException;

public class ConsoleApp {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.print("Nie podałeś parametru!!!");
            System.exit(1);
        }

        try {
            int[] data = DataFileScanner.readFile(args[0]);

            App.printArray("Wczytane dane", data);

            SortingAlgorithm sortingAlgorithm = new BubbleSort();
            int[] sortedData = sortingAlgorithm.sort(data);
            App.printArray("Posortowane dane", sortedData);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
