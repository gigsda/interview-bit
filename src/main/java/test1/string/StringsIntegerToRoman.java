package test1.string;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by 1100383 on 2017. 4. 10..
 * * <p>
 * M = 1000
 * D = 500
 * C = 100
 * L = 50
 * X = 10
 * V = 5
 * III = 3
 * II = 2
 * I = 1
 * <p>
 * 9,4
 * <p>
 * IV IV  V VI VII
 * D DC DCC DCCC CM M
 * <p>
 * 3 4 5 6 7
 */


class Solution7 {
    /////////////
    public String intToRoman(int a) {

        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        map.put("M", 1000);
        map.put("CM", 900);
        map.put("D", 500);
        map.put("CD", 400);
        map.put("C", 100);
        map.put("XC", 90);
        map.put("L", 50);
        map.put("XL", 40);
        map.put("X", 10);
        map.put("IX", 9);
        map.put("V", 5);
        map.put("IV", 4);
        map.put("I", 1);

        String sum = "";

        for (Map.Entry<String, Integer> entry : map.entrySet()) {

            while (a != 0) {
                {
                    if (entry.getValue() <= a) {
                        sum += entry.getKey();
                        a -= entry.getValue();
                    } else
                        break;
                }
            }
        }

        return sum;

    }

////////////
}

public class StringsIntegerToRoman {
    public static void main(String[] arg) {
        Solution7 sol = new Solution7();

        System.out.println(sol.intToRoman(1904));
        System.out.println(sol.intToRoman(1990));
        System.out.println(sol.intToRoman(2014));


    }
}
