package test1.dynamic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by 1100383 on 2017. 4. 10..
 */


class Solution4 {
/////////////
public int maxProfit(final List<Integer> a) {
    if (a.isEmpty())
        return 0;
    int maxSellPrice = a.get(a.size()-1);
    int maxProfit = 0;
    for(int i = a.size()-2; i >= 0; i--){
        maxProfit = Math.max(maxProfit,maxSellPrice-a.get(i));
        maxSellPrice = Math.max(maxSellPrice,a.get(i));
    }
    return maxProfit;
}

////////////
}

public class SuffixprefixdpBestTimetoBuyandSellStocksI {
    public static void main(String[] arg) {
        Solution4 sol = new Solution4();

        System.out.println(sol.maxProfit(new ArrayList<>(Arrays.asList(2,1))));
    }
}
