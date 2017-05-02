package test1.array;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by 1100383 on 2017. 4. 10..
 */


class Solution3 {
/////////////
public int coverPoints(ArrayList<Integer> X, ArrayList<Integer> Y) {
    int n = X.size();
    int x = X.get(0);
    int y = Y.get(0);
    int sum = 0;

    for(int i = 1;i < n; i++){
        int x1 = X.get(i);
        int y1 = Y.get(i);

        int lenx = Math.abs(x-x1);
        int leny =Math.abs(y-y1);

        sum += lenx+leny-Math.min(lenx,leny);
        x = X.get(i);
        y = Y.get(i);
    }
    return (int)sum;
}

////////////
}

public class ArraymathMinStepsinInfiniteGrid {
    public static void main(String[] arg) {
        Solution3 sol = new Solution3();

        System.out.println(sol.coverPoints(new ArrayList<Integer>(Arrays.asList(0,1,1)),new ArrayList<Integer>(Arrays.asList(0,1,2))));
    }
}
