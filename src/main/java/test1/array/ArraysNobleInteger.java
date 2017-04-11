package test1.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by 1100383 on 2017. 4. 10..
 */
public class ArraysNobleInteger {
    public static int solve(ArrayList<Integer> A) {


        Collections.sort(A);

        for (int i = 0;i < A.size(); i++){

            int j = 0;
            for (j = i+1; j< A.size(); j++)
                if (A.get(j) > A.get(i))
                    break;
             if (A.get(i) == A.size() - j)
                 return 1;
        }


        return -1;
    }
    public static void main(String [ ] arg) {
        System.out.println(solve(new ArrayList<Integer>(Arrays.asList(1,2,4,4))));
    }
}
