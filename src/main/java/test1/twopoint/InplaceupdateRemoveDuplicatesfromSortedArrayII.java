package test1.twopoint;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by 1100383 on 2017. 4. 10..
 */


class Solution7 {
/////////////
public int removeDuplicates(ArrayList<Integer> a) {
    int pi = 0;
    int psc = 0;
    int n = a.size();
    if (a.size() == 1)
        return 1;

    for(int i = 1;i < n; i++){
        if(a.get(pi).intValue() == a.get(i))
            psc++;
        else
            psc = 0;

        if (psc <= 1){
            a.set(pi+1,a.get(i));
            pi++;
        }

    }

    for(int i = 0;i < n-pi-1; i++)
        a.remove(a.size()-1);

    return pi+1;
}

////////////
}

public class InplaceupdateRemoveDuplicatesfromSortedArrayII {
    public static void main(String[] arg) {
        Solution7 sol = new Solution7();

        System.out.println(sol.removeDuplicates(new ArrayList<>(Arrays.asList(  1000, 1000, 1000, 1000, 1001, 1002, 1003, 1003, 1004, 1010))));

    }
}
