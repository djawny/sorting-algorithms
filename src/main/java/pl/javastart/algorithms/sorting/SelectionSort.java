package pl.javastart.algorithms.sorting;

/**
 * Created by jakubwrabel on 16.12.2016.
 */
public class SelectionSort extends SortingAlgorithm {
    public int[] sort(int[] data) {

        for (int i = 0; i < data.length - 1; i++) {
            int minValue = getIndexOfMinValue(i, data);
            if (minValue != i) swap(i, minValue, data);
        }
        return data;
    }

    public int getIndexOfMinValue(int start, int[] array) {
        int minIndex = start;

        for (int i = start + 1; i < array.length; i++) {
            if (array[i] < array[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    @Override
    public String toString() {
        return "Selection sort";
    }
}
