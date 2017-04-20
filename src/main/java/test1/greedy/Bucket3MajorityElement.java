package test1.greedy;

import java.util.*;

/**
 * Created by 1100383 on 2017. 4. 10..
 */


class Solution {
/////////////
public int majorityElement(final List<Integer> a) {

    TreeMap<Integer,Integer> hm = new TreeMap<>();

    if (a.size() == 1)
        return a.get(0);

    double m = Math.floor((double)a.size()/2);

    for (int i = 0;i < a.size(); i++){
        if (hm.containsKey(a.get(i))){
            int t = hm.get(a.get(i));
            hm.remove(a.get(i));
            if (t+1 >= m)
                return a.get(i);
            hm.put(a.get(i),t+1);
        }else{
            hm.put(a.get(i),0);
        }
    }
    return 0;
}

////////////
}

public class Bucket3MajorityElement {
    public static void main(String[] arg) {
        Solution sol = new Solution();

        System.out.println(sol.majorityElement(new ArrayList<>(Arrays.asList(668474))));
    }
}
