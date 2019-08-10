package com.stefan.alghoritms.sort;

public class InsertionSort {

    public void insertionSort(int[] array, int arraySize) {
        for (int i = 1; i < arraySize; i++) {
            int j = i;
            int toInsert = array[i];
            while(j > 0 && array[j-1] > toInsert) {
                array[j] = array[j-1];
                j--;
            }
            array[j] = toInsert;
        }
    }

}
