package test1.dynamic;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by 1100383 on 2017. 4. 10..
 */


class Solution8 {
/////////////
public int canJump(ArrayList<Integer> a) {
    int n = a.size();
    if (n <= 1)
        return 1;
    int len = a.get(0);
    if (len == 0)
        return 0;

    for(int i = 1;i < n-1; i++){
        len--;
        if (len < a.get(i))
            len = a.get(i);
        if (len <= 0)
            return 0;
    }
    return 1;
}

////////////
}

public class GreedyordpJumpGameArray {
    public static void main(String[] arg) {
        Solution8 sol = new Solution8();

        System.out.println(sol.canJump(new ArrayList<>(Arrays.asList(1))));
    }
}
