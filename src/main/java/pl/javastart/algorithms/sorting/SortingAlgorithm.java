package pl.javastart.algorithms.sorting;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jakubwrabel on 16.12.2016.
 */
public abstract class SortingAlgorithm {
    public abstract int[] sort(int[] data);

    public void swap(int index1, int index2, int[] data) {
        int tempValue = data[index1];
        data[index1] = data[index2];
        data[index2] = tempValue;
    }

    public int[] convertListToArray(List<Integer> integers) {
        int[] array = new int[integers.size()];

        for (int i = 0; i < integers.size(); i++) {
            array[i] = integers.get(i);
        }

        return array;
    }

    public List<Integer> convertArrayToList(int[] array){

        List<Integer> list = new ArrayList<Integer>();
        for (int index = 0; index < array.length; index++)
        {
            list.add(array[index]);
        }
        return list;
    }
}
