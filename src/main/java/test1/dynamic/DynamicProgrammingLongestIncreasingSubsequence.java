package test1.dynamic;

import java.util.*;

/**
 * Created by 1100383 on 2017. 4. 10..
 */
public class DynamicProgrammingLongestIncreasingSubsequence {
    public static int lis(final List<Integer> a) {

        int n = a.size();
        int max = 0;


        Map<Integer, Integer> map = new TreeMap<Integer, Integer>();


        for (int i = 0; i < n; i++) {

            if (!map.containsKey(a.get(i)))
                map.put(a.get(i), 1);

            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

                if (entry.getKey() >= a.get(i))
                    break;

                if (map.get(a.get(i)) < entry.getValue()+1)
                    map.put(a.get(i), entry.getValue() + 1);

            }

        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (max < entry.getValue())
                max = entry.getValue();
        }
        return max;
    }

    public static void main(String[] arg) {
        System.out.print("max:" + lis(new ArrayList<Integer>(Arrays.asList(0))));
    }
}
