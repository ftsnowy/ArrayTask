package org.example.service.sort.impl;

import org.example.entity.DoubleArrayWrapper;
import org.example.service.sort.ArraySort;

public class ArraySortImpl implements ArraySort {

    @Override
    public void bubbleSort(DoubleArrayWrapper wrapper) {
        if (wrapper == null || wrapper.isEmpty()) {
            return;
        }
        double[] array = wrapper.getArray();
        int n = array.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    double temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
        wrapper.setArray(array);
    }

    @Override
    public void insertionSort(DoubleArrayWrapper wrapper) {
        if (wrapper == null || wrapper.isEmpty()) {
            return;
        }
        double[] array = wrapper.getArray();
        int n = array.length;
        for (int i = 1; i < n; i++) {
            double key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
        wrapper.setArray(array);
    }
}
