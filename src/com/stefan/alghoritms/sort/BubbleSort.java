package com.stefan.alghoritms.sort;

import com.stefan.alghoritms.utils.HelperUtils;

public class BubbleSort {

    public void bubbleSort(int[] array, int arraySize) {
        for (int i = arraySize - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j+1]) {
                    HelperUtils.swap(array, j, j + 1);
                }
            }
        }
    }

}
