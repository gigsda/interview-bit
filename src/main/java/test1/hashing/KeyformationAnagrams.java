package test1.hashing;

import java.util.*;

/**
 * Created by 1100383 on 2017. 4. 10..
 */


class Solution4 {
    /////////////
        public ArrayList<ArrayList<Integer>> anagrams(final List<String> a) {
            int n = a.size();
            ArrayList<HashMap<Character,Integer>> sets = new ArrayList<>();
            boolean check[] = new boolean[n];

            for (int i = 0; i < n; i++) {
                HashMap<Character,Integer> set = new HashMap<>();
                for (Character c : a.get(i).toCharArray()) {
                    if (set.containsKey(c))
                        set.put(c,set.get(c)+1);
                    else
                        set.put(c,0);
                }
                sets.add(set);
            }

            ArrayList<ArrayList<Integer>> res = new ArrayList<>();

            for (int i = 0;i < n; i++)
            if (check[i] == false){
                ArrayList<Integer> list = new ArrayList<>();

                list.add(i+1);

                for (int j = i+1;j < n; j++){
                    if (check[j] == false && sets.get(i).equals(sets.get(j))){
                        check[j] = true;
                        list.add(j+1);
                    }
                }

                    res.add(list);
            }
            return res;
        }

////////////
}

public class KeyformationAnagrams {
    public static void main(String[] arg) {
        Solution4 sol = new Solution4();

        System.out.println(sol.anagrams(new ArrayList<String>(Arrays.asList("cat", "dog", "god", "tca"))));
    }
}
