import com.stefan.alghoritms.MergeSort;
import com.stefan.alghoritms.QuickSort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        MergeSort ms = new MergeSort();
//        int[] A = {10, 5, 2, 7, 4, 9, 12, 1, 8, 6, 11, 3};
        int[] A = {6, 4, 5, 2, 1, 3};
        System.out.println(Arrays.toString(A));
        ms.mergeSort(A);
        System.out.println(Arrays.toString(A));
    }

}
