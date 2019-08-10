import com.stefan.alghoritms.ArrayStructure;
import com.stefan.alghoritms.sort.BubbleSort;
import com.stefan.alghoritms.sort.InsertionSort;
import com.stefan.alghoritms.sort.SelectionSort;

public class Main {

    public static void main(String[] args) {
////        MERGE SORT
//        MergeSort ms = new MergeSort();
//        int[] A = {10, 5, 2, 7, 4, 9, 12, 1, 8, 6, 11, 3};
//        System.out.println(Arrays.toString(A));
//        ms.mergeSort(A);
//        System.out.println(Arrays.toString(A));

//        Array Structures
        BubbleSort bs = new BubbleSort();
        SelectionSort ss = new SelectionSort();
        InsertionSort is = new InsertionSort();
        ArrayStructure newArray = new ArrayStructure();
        newArray.generateRandomArray();
        newArray.printArray();
        System.out.println("Value at index 4 is: " + newArray.getValueAtIndex(4));
        System.out.println("Does array contains value 18: " + newArray.doesArrayContainsValue(18));
        System.out.println("Indexes for value 18: " + newArray.linearSearchForValue(18));
//        bs.bubbleSort(newArray.getArray(), 10);
//        ss.selectionSort(newArray.getArray(), 10);
        is.insertionSort(newArray.getArray(), 10);
        newArray.printArray();
        newArray.binarySearchForValue(18);
    }

}
