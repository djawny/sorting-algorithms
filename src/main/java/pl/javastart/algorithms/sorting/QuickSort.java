package pl.javastart.algorithms.sorting;

import java.util.ArrayList;
import java.util.List;

public class QuickSort extends SortingAlgorithm {
    public int[] sort(int[] data) {
        List<Integer> list = new ArrayList<>();

        list = convertArrayToList(data);
        list = quickSort(list);
        data = convertListToArray(list);

        return data;
    }

    @Override
    public String toString() {
        return "Quicksort";
    }

    public List<Integer> quickSort(List<Integer> list) {

        if (list.size() <= 1) {
            return list;
        }

        List<Integer> result = new ArrayList<Integer>();
        List<Integer> lower = new ArrayList<Integer>();
        List<Integer> higher = new ArrayList<Integer>();

        Integer pivot = list.remove(list.size() / 2);

        for (Integer integer : list) {
            if (integer < pivot) {
                lower.add(integer);
            } else {
                higher.add(integer);
            }
        }

        lower = quickSort(lower);
        higher = quickSort(higher);

        result.addAll(lower);
        result.add(pivot);
        result.addAll(higher);
        return result;
    }
}
