package test1.greedy;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by 1100383 on 2017. 4. 10..
 */


class Solution3 {
/////////////
public int bulbs(ArrayList<Integer> a) {

    ArrayList<Boolean> ar = new ArrayList<>();

    a.forEach(el->ar.add((el == 0)?false:true));
    Boolean r = true;
    int step = 0;

    for (int i = 0;i < a.size(); i++){
        if(Boolean.logicalXor(ar.get(i),r) == true){
            r = !r;
            step ++;
        }
    }
    return step;
}

////////////
}

public class Bucket6Bulbs	 {
    public static void main(String[] arg) {
        Solution3 sol = new Solution3();

        System.out.println(sol.bulbs(new ArrayList<>(Arrays.asList(1, 1, 0, 0, 1, 1, 0, 0, 1))));
        System.out.println(sol.bulbs(new ArrayList<>(Arrays.asList(0,1,0,1))));
    }
}
