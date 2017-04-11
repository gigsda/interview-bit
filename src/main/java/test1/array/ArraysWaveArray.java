package test1.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by 1100383 on 2017. 4. 10..
 */
public class ArraysWaveArray {
    public static ArrayList<Integer> wave(ArrayList<Integer> a) {


        int t = 0;
        Collections.sort(a);

        Integer []k = a.toArray(new Integer[a.size()]);
        for (int i = 1;i < a.size(); i+=2){
            t = k[i-1];
            k[i-1] = k[i];
            k[i] = t;
        }
        return new ArrayList<>(Arrays.asList(k));
    }

    public static void main(String [ ] arg) {
        System.out.print(wave(new ArrayList<Integer>(Arrays.asList(1, 2, 2, 4,4))));
    }
}
