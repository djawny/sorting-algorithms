package pl.javastart.algorithms.sorting;

import org.junit.Test;
import pl.javastart.algorithms.sorting.SortingAlgorithm;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

/**
 * Created by jakubwrabel on 16.12.2016.
 */
public abstract class SortingAlgorithmsTest {
    abstract SortingAlgorithm getSortingAlgorithm();

    @Test
    public void testSort_simpleCase() throws Exception {
        // given
        int[] data = new int[]{3, 2, 1};

        // when
        int[] sorted = getSortingAlgorithm().sort(data);

        // then
        assertTrue(Arrays.equals(sorted, new int[]{1, 2, 3}));
    }

    @Test
    public void testSort_hardCase() throws Exception {
        // given
        int[] data = new int[]{640, 100, 1, 20, 70, 30, 800};

        // when
        int[] sorted = getSortingAlgorithm().sort(data);

        // then
        assertTrue(Arrays.equals(sorted, new int[]{1, 20, 30, 70, 100, 640, 800}));
    }

    @Test
    public void testSort_negativeNumbers() throws Exception {
        // given
        int[] data = new int[]{100, -200, -100, 10, -60};

        // when
        int[] sorted = getSortingAlgorithm().sort(data);

        // then
        assertTrue(Arrays.equals(sorted, new int[]{-200, -100, -60, 10, 100}));
    }

    @Test
    public void testSort_emptyArray() throws Exception {
        // given
        int[] data = new int[]{};

        // when
        int[] sorted = getSortingAlgorithm().sort(data);

        // then
        assertTrue(Arrays.equals(sorted, new int[]{}));
    }

    @Test
    public void testSort_oneElementArray() throws Exception {
        // given
        int[] data = new int[]{100};

        // when
        int[] sorted = getSortingAlgorithm().sort(data);

        // then
        assertTrue(Arrays.equals(sorted, new int[]{100}));
    }

}