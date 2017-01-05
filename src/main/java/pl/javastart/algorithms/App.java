package pl.javastart.algorithms;

import pl.javastart.algorithms.io.DataFileReader;
import pl.javastart.algorithms.sorting.*;

import java.io.IOException;


public class App {
    public static void main(String[] args) {
        SortingAlgorithm sortingAlgorithm = new QuickSort();

        int[] data = new int[0];
        try {
            data = DataFileReader.readFile("dane.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

        printArray("Data before", data);

        System.out.println("Sorting using " + sortingAlgorithm);

        int[] sorted = sortingAlgorithm.sort(data);
        printArray("Data sorted", sorted);
    }

    public static void printArray(String description, int[] data) {
        System.out.println("---   " + description + "   ---");

        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]);

            if (i != (data.length - 1)) {
                System.out.print(", ");
            }
        }

        System.out.println();
    }
}
