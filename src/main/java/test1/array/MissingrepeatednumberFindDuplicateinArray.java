package test1.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by 1100383 on 2017. 4. 10..
 * Split the numbers from 1 to n in sqrt(n) ranges so that range i corresponds to [sqrt(n) * i .. sqrt(n) * (i + 1)).

 Do one pass through the stream of numbers and figure out how many numbers fall in each of the ranges.

 At least one of the ranges will contain more than sqrt(n) elements.

 Do another pass and process just those elements in the oversubscribed range.

 Using a hash table to keep frequencies, you’ll find a repeated element.

 This is O(sqrt(n)) memory and 2 sequential passes through the stream.
 ??
 */


class Solution {
    /////////////
    public int repeatedNumber2(final List<Integer> a) {
        int check[] = new int[a.size()];

        for (int i = 0; i < a.size(); i++) {
            if (check[a.get(i)] == 1)
                return a.get(i);
            check[a.get(i)] = 1;
        }
        return -1;
    }

    public int repeatedNumber(final List<Integer> V) {
        if (V.size() <= 1) return -1;
        int valueRange = V.size() - 1; // 1 to N when the size is N+1.
        int range = (int)Math.sqrt(valueRange);
        if (range * range < valueRange) range++;
        int count[] = new int[range + 1];


        for (int i = 0; i < V.size(); i++) {
            count[(V.get(i) - 1) / range]++;
        }

        int repeatingRange = -1;
        int numRanges = ((valueRange - 1) / range) + 1;
        for (int i = 0; i < numRanges && repeatingRange == -1; i++) {
            if (i < numRanges - 1 || valueRange % range == 0) {
                if (count[i] > range) repeatingRange = i;
            } else {
                if (count[i] > valueRange % range) repeatingRange = i;
            }
        }
        if (repeatingRange == -1) return -1;

        for(int i = 0;i < count.length; i++) count[i] = 0;

        for (int i = 0; i < V.size(); i++) {
            if ((V.get(i) - 1) / range == repeatingRange) count[(V.get(i) - 1) % range]++;
        }
        for (int i = 0; i < range; i++) {
            if (count[i] > 1) {
                return repeatingRange * range + i + 1;
            }
        }
        return -1;
    }
////////////
}

public class MissingrepeatednumberFindDuplicateinArray {
    public static void main(String[] arg) {
        Solution sol = new Solution();

        System.out.println(sol.repeatedNumber(new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 3))));
    }
}
