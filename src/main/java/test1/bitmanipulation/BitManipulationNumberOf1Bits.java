package test1.bitmanipulation;

/**
 * Created by 1100383 on 2017. 4. 10..
 */


class Solution2 {
/////////////
public int numSetBits(long a) {

    String m = Long.toBinaryString(a);

    int cnt = 0;

    for (int i = 0;i < m.length(); i++)
        if (m.charAt(i) == '1')
            cnt++;

    return cnt;
}

////////////
}

public class BitManipulationNumberOf1Bits {
    public static void main(String[] arg) {
        Solution2 sol = new Solution2();
        System.out.println(sol.numSetBits(11));
        System.out.println(sol.numSetBits(1));
        System.out.println(sol.numSetBits(0));
        System.out.println(sol.numSetBits(22));


    }
}
