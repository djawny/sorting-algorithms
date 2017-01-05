package pl.javastart.algorithms.sorting;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jakubwrabel on 16.12.2016.
 */
public class InsertionSort extends SortingAlgorithm {
    public int[] sort(int[] data) {
        List<Integer> list = new ArrayList();

        for (int element : data) {
            int index = getIndexToInsert(list, element);
            list.add(index, element);
        }

        return convertListToArray(list);
    }

    @Override
    public String toString() {
        return "Insertion sort";
    }

    int getIndexToInsert(List<Integer> integers, int value) {
        for (int i = 0; i < integers.size(); i++) {
            if (integers.get(i) > value) {
                return i;
            }
        }

        return integers.size();
    }
}