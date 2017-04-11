package test1.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by 1100383 on 2017. 4. 10..
 */
public class ArraymathMaxSumContiguousSubarray {
    public static int maxSubArray(final List<Integer> a) {

        int maxsum = a.get(0);

        if (a.size() == 0)
            return 0;
        Integer dy[] = new Integer[a.size()];

        dy[0] = a.get(0);
        for (int i = 1;i < a.size(); i++){
            if (dy[i-1] + a.get(i) > a.get(i))
                dy[i] = dy[i-1] + a.get(i);
            else
                dy[i] = a.get(i);
        }

        for (int i = 0;i < a.size(); i++)
            if (maxsum < dy[i])
                maxsum = dy[i];

        return maxsum;
    }
    public static void main(String [ ] arg) {
        System.out.print(maxSubArray(new ArrayList<>(Arrays.asList(-2,1,-3,4,-1,2,3,-5,4))));
    }
}
