package test1.math;

import java.util.ArrayList;

/**
 * Created by 1100383 on 2017. 4. 10..
 */


class Solution2 {
    /////////////
    public ArrayList<String> fizzBuzz(int A) {
        ArrayList<String> ar = new ArrayList<String>();

        for (int i = 1;i <= A; i++){
            String in = "";

            if (i % 3 == 0)
                in += "Fizz";

            if (i % 5 == 0)
                in += "Buzz";

            if (i%3!=0 && i%5!=0)
                in = new Integer(i).toString();

            ar.add(in);
        }
        return ar;
    }

////////////
}

public class FizzBuzz {
    public static void main(String[] arg) {
        Solution2 sol = new Solution2();
        System.out.println(sol.fizzBuzz(15));
    }
}
