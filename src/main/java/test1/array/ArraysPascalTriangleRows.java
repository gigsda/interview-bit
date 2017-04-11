package test1.array;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by 1100383 on 2017. 4. 10..
 */
public class ArraysPascalTriangleRows {
    public static ArrayList<ArrayList<Integer>> generate(int a) {
        ArrayList<ArrayList<Integer>> b = new ArrayList<ArrayList<Integer>>();

        if (a ==0) return b;

        b.add(new ArrayList<Integer>(Arrays.asList(1)));

        for (int i = 1;i < a; i++){
            ArrayList<Integer> nl = new ArrayList<Integer>();
            ArrayList<Integer> l = (b.get(i-1));

            nl.add(l.get(0));
            for (int k = 1;k < i; k++)
                nl.add(l.get(k-1)+l.get(k));
            nl.add(l.get(i-1));

            b.add(nl);
        }
        return b;
    }

    public static void main(String [ ] arg) {
        ArrayList<ArrayList<Integer>> b = generate(0);

        for (int i = 0;i < b.size(); i++){
            System.out.println(b.get(i).toString());
        }

    }
}
