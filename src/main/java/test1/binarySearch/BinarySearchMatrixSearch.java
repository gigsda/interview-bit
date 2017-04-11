package test1.binarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by 1100383 on 2017. 4. 10..
 */
public class BinarySearchMatrixSearch {
    public static int searchMatrix(ArrayList<ArrayList<Integer>> a, int b) {

        try {

            int i = 0;
            for (; i < a.size(); i++) {
                if ((a.get(i)).get(0) <= b && b <= (a.get(i)).get(a.get(i).size()-1)) {
                    return (Collections.binarySearch(a.get(i) ,b) >= 0)? 1 : 0;
                }
            }

        }catch (Exception e){
            return 0;
        }

        return 0;
    }

    public static void main(String[] arg) {


        ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();

      /*
      a.add(new ArrayList<Integer>(Arrays.asList(1, 3, 5, 7)));
        a.add(new ArrayList<Integer>(Arrays.asList(10, 11, 16, 20)));
        a.add(new ArrayList<Integer>(Arrays.asList(23, 30, 34, 50)));
*/
        a.add(new ArrayList<Integer>(Arrays.asList()));
        a.add(new ArrayList<Integer>(Arrays.asList()));
        a.add(new ArrayList<Integer>(Arrays.asList()));
        System.out.println(searchMatrix(a, 23));
    }
}
