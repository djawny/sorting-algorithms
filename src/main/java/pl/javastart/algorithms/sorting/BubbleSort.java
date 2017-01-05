package pl.javastart.algorithms.sorting;

import java.util.Arrays;

/**
 * Created by jakubwrabel on 16.12.2016.
 */
public class BubbleSort extends SortingAlgorithm {
    public int[] sort(int[] data) {
        boolean ifSwapped = true;

        while (ifSwapped) {
            ifSwapped = false;
            for (int i = data.length - 1; i > 0; i--) {
                if (data[i - 1] > data[i]) {
                    swap(i - 1, i, data);
                    ifSwapped = true;
                }
            }
        }
        return data;
    }

    @Override
    public String toString() {
        return "Bubble sort";
    }
}
