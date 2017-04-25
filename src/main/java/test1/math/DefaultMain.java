package test1.math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Created by 1100383 on 2017. 4. 10..
 */

class Solution8 {
    /////////////
    public int hammingDistance(final List<Integer> A) {
        A.sort(Comparator.naturalOrder());
        int sum = 0;
        int n = A.size();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sum += getHammingd(A.get(i), A.get(j));
                sum %= 1000000007;
                System.out.print(getHammingd(A.get(i), A.get(j)));
                System.out.print(" ");
            }
            System.out.println("");
        }
        return (sum*2)%1000000007;
    }

    int count_set_bits(int n) {
        int count = 0; // count accumulates the total bits set
        while (n != 0) {
            n &= (n - 1); // clear the least significant bit set
            count++;
        }
        return count;
    }

    private int getHammingd(Integer a, Integer b) {
        int c = a ^ b;
        return count_set_bits(c);
    }

////////////
}

public class DefaultMain {
    public static void main(String[] arg) {
        Solution8 sol = new Solution8();
        System.out.println(sol.hammingDistance(new ArrayList<Integer>(Arrays.asList(2,141,3319,14882,44882,145561,2145561))));
    }
}
