package test1.hashing;

import java.util.HashSet;

/**
 * Created by 1100383 on 2017. 4. 10..
 */


class Solution3 {
/////////////
public int colorful(int a) {
    String arr = new Integer(a).toString();
    Long sum = 1L;
    HashSet<Long> set = new HashSet<>();


    int n = arr.length();
    for(int i = 0;i < n; i++){
        sum = 1L;
        for(int j = i;j < n  ; j++){

            sum *= (arr.charAt(j)-'0');
            if (set.contains(sum))
                return 0;
            set.add(sum);
        }
    }
    return 1;
}

////////////
}

public class HashsearchColorfulNumber {
    public static void main(String[] arg) {
        Solution3 sol = new Solution3();

        System.out.println(sol.colorful(23));
    }
}
