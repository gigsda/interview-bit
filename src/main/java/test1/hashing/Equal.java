package test1.hashing;

import java.util.*;

/**
 * https://www.interviewbit.com/problems/equal/
 * Created by 1100383 on 2017. 4. 10..
 */


class Solution1 {
    /////////////
    public class Pair<L, R> {

        private L left;
        private R right;

        public Pair(L left, R right) {
            this.left = left;
            this.right = right;
        }
    }


    public ArrayList<Integer> equal(ArrayList<Integer> a) {
        HashMap<Integer,Pair<Integer, Integer>> p = new HashMap<>();

        ArrayList<Integer> ans = new ArrayList<>();
        ArrayList<Integer> tans = new ArrayList<>();

        int n = a.size();

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int key = a.get(i) + a.get(j);
                if (!p.containsKey(key)) {
                    p.put(key, new Pair(i,j));
                    continue;
                }

                Pair<Integer,Integer> pair = p.get(key);

                if (pair.right != i && pair.left != j && pair.right != j && pair.left != i){
                    tans.clear();
                    tans.addAll(new ArrayList<Integer>(Arrays.asList(pair.left,pair.right,i,j)));
                }

                if (ans.size() == 0) ans = tans;
                else
                {
                    for(int k = 0;k < 4; k++){

                    }
                }



            }
        }
        return null;
    }

////////////
}

public class Equal {
    public static void main(String[] arg) {
        Solution1 sol = new Solution1();

        System.out.println(sol.equal(new ArrayList<>(Arrays.asList(1, 1, 1, 1))));
    }
}
