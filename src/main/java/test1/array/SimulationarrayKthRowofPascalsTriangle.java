package test1.array;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by 1100383 on 2017. 4. 10..
 */
public class SimulationarrayKthRowofPascalsTriangle {
    public static ArrayList<Integer> getRow(int a) {


        ArrayList<Integer> m = new ArrayList<>();
        Integer am[] = new Integer[a+1];

        am[0] = 1;

        for (int i = 1;i <= a; i++){

            int t = 1;
            int tt = t;
            for (int k = 1; k < i; k++) {
                t = am[k];
                am[k] = tt + am[k];
                tt = t;
            }
            am[i] = 1;

        }

        return new ArrayList<Integer>(Arrays.asList(am));
    }
    public static void main(String [ ] arg) {
        System.out.print(getRow(4));
    }
}
