package com.stefan.alghoritms.sort;

import com.stefan.alghoritms.utils.HelperUtils;

public class QuickSort {

    public void quickSort(int arr[], int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end);
            quickSort(arr, begin, partitionIndex-1);
            quickSort(arr, partitionIndex+1, end);
        }
    }

    private int partition(int arr[], int begin, int end) {
        int pivot = arr[end];
        int i = (begin-1);
        for (int j = begin; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;
                HelperUtils.swap(arr, i , j);
            }
        }
        HelperUtils.swap(arr, i+1, end);
        return i+1;
    }

}
