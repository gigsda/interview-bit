package test1.hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * Created by 1100383 on 2017. 4. 10..
 */



class Solution {
    /////////////
    public int diffPossible(final List<Integer> a, int b) {
        HashMap<Integer, Integer> hashMap = new LinkedHashMap<>();

        for (int i = 0; i < a.size(); i++)
            hashMap.put(a.get(i), i);

        for (int i = 0; i < a.size(); i++)
            if (hashMap.containsKey(b + a.get(i)))
                if (hashMap.get(b + a.get(i)) != i)
                    return 1;

        return 0;
    }

////////////
}

public class DiffkIi {
    public static void main(String[] arg) {
        Solution sol = new Solution();
        System.out.println(sol.diffPossible(Arrays.asList(2,4,1), 3));
    }
}
