import com.stefan.alghoritms.ArrayStructure;
import com.stefan.alghoritms.MergeSort;
import com.stefan.alghoritms.QuickSort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
////        MERGE SORT
//        MergeSort ms = new MergeSort();
//        int[] A = {10, 5, 2, 7, 4, 9, 12, 1, 8, 6, 11, 3};
//        System.out.println(Arrays.toString(A));
//        ms.mergeSort(A);
//        System.out.println(Arrays.toString(A));

//        Array Structures
        ArrayStructure newArray = new ArrayStructure();
        newArray.generateRandomArray();
        newArray.printArray();
        System.out.println("Value at index 4 is: " + newArray.getValueAtIndex(4));
        System.out.println("Does array contains value 18: " + newArray.doesArrayContainsValue(18));
        newArray.deleteIndex(4);
        newArray.printArray();
        newArray.insertValue(13);
        newArray.printArray();
        System.out.println("Indexes for value 18: " + newArray.linearSearchForValue(18));
    }

}
