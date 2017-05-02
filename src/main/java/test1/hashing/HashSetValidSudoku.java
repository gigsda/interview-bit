package test1.hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * Created by 1100383 on 2017. 4. 10..
 */


class Solution5 {
    /////////////
    List<String> a;

    int getXY(int i, int j) {
        char c = ((String) (a.get(i))).charAt(j);
        if (c == '.')
            return 0;

        return c - '0';
    }

    public int isValidSudoku(final List<String> a) {
        this.a = a;


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                HashSet<Integer> set = new HashSet<>();
                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {
                        Integer c = getXY(i * 3 + k, j * 3 + l);

                        if (c != 0 && set.contains(c))
                            return 0;
                        set.add(c);
                    }
                }
            }
        }


        for (int i = 0; i < 9; i++) {
            HashSet<Integer> set = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                Integer c = getXY(i, j);
                if (c != 0 && set.contains(c))
                    return 0;
                set.add(c);
            }
        }

        for (int i = 0; i < 9; i++) {
            HashSet<Integer> set = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                Integer c = getXY(j, i);
                if (c != 0 && set.contains(c))
                    return 0;
                set.add(c);
            }
        }

        return 1;
    }

}

////////////


public class HashSetValidSudoku {
    public static void main(String[] arg) {
        Solution5 sol = new Solution5();

        System.out.println(sol.isValidSudoku(new ArrayList<>(Arrays.asList(
                "53..7....",
                "6..195...",
                ".98....6.",
                "8...6...3",
                "4..8.3..1",
                "7...2...6",
                ".6....28.",
                "...419..5",
                "....8..79"))));
    }
}
