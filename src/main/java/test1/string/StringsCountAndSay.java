package test1.string;

/**
 * Created by 1100383 on 2017. 4. 10..
 */


class Solution10 {
/////////////
public String countAndSay(int a) {

    String ar = "1";
    for (int i = 1;i < a; i++){
        String an = "";
        char m = ar.charAt(0);
        int cm = 1;
        for (int j = 1;j < ar.length(); j++){
            if (ar.charAt(j) != m){
                an = an.concat(new Integer(cm).toString());
                an = an.concat(String.valueOf(m));

                m = ar.charAt(j);
                cm = 1;
            }else {
                cm ++;
            }
        }
        if (cm > 0){
            an = an.concat(new Integer(cm).toString());
            an =an.concat(String.valueOf(m));
        }
        ar = an;
    }

    return ar;
}

////////////  1, 11, 21, 1211, 111221, 13112221
}

public class StringsCountAndSay {
    public static void main(String[] arg) {
        Solution10 sol = new Solution10();

        System.out.println(sol.countAndSay(38));
    }
}
