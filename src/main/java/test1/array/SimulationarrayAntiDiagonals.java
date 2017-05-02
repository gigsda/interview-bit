package test1.array;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by 1100383 on 2017. 4. 10..
 */


class Solution2 {
/////////////
public ArrayList<ArrayList<Integer>> diagonal(ArrayList<ArrayList<Integer>> a) {
    int n = a.size();

    ArrayList<ArrayList<Integer>> res = new ArrayList<>();

    for(int i = 0;i < n; i++){

        ArrayList<Integer> nline = new ArrayList<>();
        for (int j = i;j >= 0; j--) {
            nline.add(a.get(i-j).get(j));
        }
        res.add(nline);
        //System.out.println(nline);
    }
    for (int j = 1;j < n; j++) {

        ArrayList<Integer> nline = new ArrayList<>();
        for(int i = n-j-1;i >= 0 ; i--){
            nline.add(a.get(n-1-i).get(j+i));
        }
        res.add(nline);
    }
    return res;
}

////////////
}

public class SimulationarrayAntiDiagonals {
    public static void main(String[] arg) {
        Solution2 sol = new Solution2();

        System.out.println(sol.diagonal(new ArrayList<ArrayList<Integer>>(Arrays.asList(
                new ArrayList<Integer>(Arrays.asList(1, 1, 5, 9, 5)),
                new ArrayList<Integer>(Arrays.asList(2, 4, 8, 4, 1)),
                new ArrayList<Integer>(Arrays.asList(3, 7, 3, 2, 3)),
                new ArrayList<Integer>(Arrays.asList(6, 2, 3, 2, 1)),
                new ArrayList<Integer>(Arrays.asList(1, 4, 1, 2, 3))
        ))));
    }
}
