package com.stefan.alghoritms.sort;

import com.stefan.alghoritms.utils.HelperUtils;

public class SelectionSort {

    public void selectionSort(int[] array, int arraySize) {
        for (int i = 0; i < arraySize; i++) {
            int minimum = i;
            for (int j = i + 1; j < arraySize; j++) {
                if (array[minimum] > array[j]) {
                    minimum = j;
                }
            }
            HelperUtils.swap(array, i, minimum);
        }
    }

}
