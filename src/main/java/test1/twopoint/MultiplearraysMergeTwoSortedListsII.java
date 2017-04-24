package test1.twopoint;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

/**
 * Created by 1100383 on 2017. 4. 10..
 */


class Solution4 {
/////////////
public void merge(ArrayList<Integer> a, ArrayList<Integer> b) {
    int j = 0,i=0;
    LinkedList<Integer> res = new LinkedList<>();

    while (i < a.size() || j < b.size()) {

        if (a.size() == i){
            res.add(b.get(j));
            j++;
        }else if(b.size() == j){
            res.add(a.get(i));
            i++;
        }
        else if (a.get(i) >= b.get(j)) {
            res.add(b.get(j));
            j++;
        }else
          if (a.get(i) <= b.get(j)) {
              res.add(a.get(i));
              i++;
        }

    }
    a.clear();
    a.addAll(res);
}

////////////
}

public class MultiplearraysMergeTwoSortedListsII {
    public static void main(String[] arg) {
        Solution4 sol = new Solution4();
        sol.merge(
                new ArrayList<>(Arrays.asList(-4, 3))
                , new ArrayList<>(Arrays.asList(-2,-2,1,99)));


    }
}
