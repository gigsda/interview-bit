package test1.heapsandmaps;

import java.util.*;

/**
 * Created by 1100383 on 2017. 4. 10..
 */


class Solution {
    /////////////
    public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {

        int n = A.size();
        HashSet<Integer> a = new HashSet<Integer>(A);
        HashSet<Integer> b = new HashSet<Integer>(B);

        A.clear();
        B.clear();
        A.addAll(a);
        B.addAll(b);

        Collections.sort(A,Collections.reverseOrder());
        Collections.sort(B,Collections.reverseOrder());

        SortedMap<Integer,Integer> tm = new TreeMap<>() ;

        for(int i = 0;i < A.size(); i++){
            for (int j = 0;j < B.size(); j++){
                tm.put((int)(Math.pow(A.get(i),2)+Math.pow(B.get(j),2)),A.get(i)+B.get(j));
            }
        }

        ArrayList<Integer> al =  new ArrayList<>(tm.values());
        al.sort(Collections.reverseOrder());


        return  new ArrayList<Integer>(al.subList(0,n));
    }

////////////
}

public class Nmaxpaircombinations {
    public static void main(String[] arg) {
        Solution sol = new Solution();

        System.out.println(sol.solve(new ArrayList<Integer>(Arrays.asList(1,4,2,3)),new ArrayList<Integer>(Arrays.asList(2,5,1,6))));
    }
}
