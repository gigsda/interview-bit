package test1.dynamic;

import java.util.HashMap;

public class NdigitnumberswithdigitsumS {

    static HashMap<String , Integer> map = new HashMap<String,Integer>();

    static int SS = 75;//478432066
    static int NN = 22;

     public static int solve2(int S, int N) {

         if(map.containsKey("S:"+S+",N:"+N))
             return map.get("S:"+S+",N:"+N);

         if (N == 0 && S != 0)
             return 0;

         if (N == 0 && S == 0)
             return 1;

         int sum = 0;

         for (int i= 9 ;i >= 0; i--) {
             if (S - i < 0) continue;

             int value = solve2( S-i, N-1);
             map.put("S:"+(S-i)+",N:"+(N-1), value);
             sum += value;
             sum %= 1000000007;
         }

        return sum;
    }

    public static int solve(int S,int N){

        Long sum = 0L;

        for (int i = 9;i >= 1; i--) {
            sum += solve2(S - i, N - 1);
            sum %= 1000000007;
        }

        return sum.intValue();
    }

    public static void main(String [ ] arg) {

        System.out.println("anser:"+solve(SS,NN));
    }
}
