package test1.Graphs;

import java.util.*;

/**
 * Created by 1100383 on 2017. 4. 10..
 */


class Solution2 {
    public int solve(int A, ArrayList<Integer> B, ArrayList<Integer> C) {

        HashMap<Integer, HashSet<Integer>> treeMap = new HashMap<>();
        HashMap<Integer, Integer> nodeCount = new HashMap<>();

        for (int i = 0; i < B.size(); i++) {
            if (!treeMap.containsKey(B.get(i))) {
                treeMap.put(B.get(i), new HashSet<Integer>());
                nodeCount.put(B.get(i),0);
            }

            if (!treeMap.containsKey(C.get(i))) {
                treeMap.put(C.get(i), new HashSet<Integer>());
                nodeCount.put(C.get(i),0);
            }

            HashSet<Integer> parents = treeMap.get(B.get(i));
            parents.add(C.get(i));
            nodeCount.put(C.get(i),nodeCount.get(C.get(i))+1);
        }

        int prv = -1;
        Stack<Integer> st = new Stack<>();
        while (!nodeCount.isEmpty()){

            for (Integer key : nodeCount.keySet()) {
                if (nodeCount.get(key) == 0){
                    HashSet<Integer> parents = treeMap.get(key);
                     parents.forEach(parentKey-> nodeCount.put(parentKey,nodeCount.get(parentKey)-1));
                    nodeCount.put(key,-1);
                    st.push(key);
                }
            }

            while (!st.isEmpty())
                nodeCount.remove(st.pop());

            if (prv == nodeCount.size())
                return 0;

            prv = nodeCount.size();
        }
        return 1;
    }
  }

public class GraphsPossibilityoffinishingallcoursesgivenprerequisitesBookmarkSuggestEdit {
    public static void main(String[] arg) {
        //B : [ 67, 8, 48, 42, 35, 25, 37, 69, 31, 36, 7, 33, 2, 47, 42, 52, 31, 70, 29, 38, 36, 60, 15, 37, 33, 27, 4, 32, 43, 55, 49, 35, 21, 28, 62, 17, 2, 61, 54, 22, 9, 56, 12, 3, 60, 52, 21, 15, 54, 63, 33, 64, 38, 16, 59, 69, 49, 52, 10, 10, 6, 56, 43, 32, 41, 66, 6 ]
//        C : [ 51, 43, 55, 27, 34, 8, 14, 5, 70, 64, 65, 57, 45, 19, 53, 50, 44, 51, 19, 41, 14, 68, 12, 58, 50, 66, 7, 47, 40, 62, 29, 5, 22, 39, 23, 34, 25, 4, 40, 26, 26, 45, 18, 28, 61, 59, 17, 46, 39, 46, 68, 24, 63, 59, 67, 53, 9, 11, 3, 44, 24, 37, 13, 1, 65, 18, 48 ]

        Solution2 sol = new Solution2();
        System.out.println(sol.solve(70,new ArrayList<Integer>(Arrays.asList(67, 8, 48, 42, 35, 25, 37, 69, 31, 36, 7, 33, 2, 47, 42, 52, 31, 70, 29, 38, 36, 60, 15, 37, 33, 27, 4, 32, 43, 55, 49, 35, 21, 28, 62, 17, 2, 61, 54, 22, 9, 56, 12, 3, 60, 52, 21, 15, 54, 63, 33, 64, 38, 16, 59, 69, 49, 52, 10, 10, 6, 56, 43, 32, 41, 66, 6)),new ArrayList<Integer>(Arrays.asList( 51, 43, 55, 27, 34, 8, 14, 5, 70, 64, 65, 57, 45, 19, 53, 50, 44, 51, 19, 41, 14, 68, 12, 58, 50, 66, 7, 47, 40, 62, 29, 5, 22, 39, 23, 34, 25, 4, 40, 26, 26, 45, 18, 28, 61, 59, 17, 46, 39, 46, 68, 24, 63, 59, 67, 53, 9, 11, 3, 44, 24, 37, 13, 1, 65, 18, 48))));
    }
}
