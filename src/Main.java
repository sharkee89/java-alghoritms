import com.stefan.alghoritms.QuickSort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        QuickSort qs = new QuickSort();
        int[] A = {4, 5, 6, 1, 3};
        System.out.println(Arrays.toString(A));
        qs.quickSort(A, 0, A.length-1);
        System.out.println(Arrays.toString(A));
    }

}
