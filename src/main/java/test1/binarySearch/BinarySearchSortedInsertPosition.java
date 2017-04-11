package test1.binarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by 1100383 on 2017. 4. 10..
 */
public class BinarySearchSortedInsertPosition {

    public static int searchInsert(ArrayList<Integer> a, int b) {


        int t = Collections.binarySearch(a,b);
        if (t < 0) {
            t *= -1;
            t -= 1;
        }

        return t;
    }

    public static void main(String [ ] arg) {
        ArrayList<Integer> A=new ArrayList<>();

        A.addAll(Arrays.asList(1,3,5,6));

        System.out.println(searchInsert(A,5));
        System.out.println(searchInsert(A,2));
        System.out.println(searchInsert(A,7));
        System.out.println(searchInsert(A,0));
        System.out.println(searchInsert(A,4));
        System.out.println(searchInsert(A,0));

    }
}
