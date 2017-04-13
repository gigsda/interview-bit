package test1.string;

/**
 * Created by 1100383 on 2017. 4. 10..
 * Given a roman numeral, convert it to an integer.
 * <p>
 * Input is guaranteed to be within the range from 1 to 3999.
 * <p>
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
 * 덧샘규칙 - 큰 단위부터 나누어서 나눈 갯수만큼 추가
 * 줄이기법칙 - 연속 4개일 경우 큰단위 에서 작은 단위   MC = 1100 CM = 900 (같은문자 4개 피하기)
 */


class Solution3 {
/////////////

    public int romanToInt(String a) {
        int m = 0;
        char pc = ' ';
        char c;
        for (int i = 0; i < a.length(); i++) {

            if (i > 0)
                pc = a.charAt(i-1);
             c = a.charAt(i);

            switch (c) {
                case 'M':
                    if (pc == 'C')
                        m -= 100 * 2;
                    m += 1000;
                    break;
                case 'D':
                    if (pc == 'C')
                        m -= 100 * 2;
                    m += 500;
                    break;
                case 'C':
                    if (pc == 'X')
                        m -= 10 * 2;
                    m += 100;
                    break;
                case 'L':
                    if (pc == 'X')
                        m -= 10 * 2;
                    m += 50;
                    break;
                case 'X':
                    if (pc == 'I')
                        m -= 1 * 2;
                    m += 10;
                    break;
                case 'V':
                    if (pc == 'I')
                        m -= 1 * 2;
                    m += 5;
                    break;
                case 'I':
                    m += 1;
                    break;
            }
        }
        return m;
    }
////////////
}

public class StringmathRomanToInteger {
    public static void main(String[] arg) {
        Solution3 sol = new Solution3();
        System.out.println(sol.romanToInt("XIV"));
        System.out.println(sol.romanToInt("XX"));
        System.out.println(sol.romanToInt("MCMLIV"));
        System.out.println(sol.romanToInt("MDCCCCX"));
        System.out.println(sol.romanToInt("MDCDIII"));


    }
}
