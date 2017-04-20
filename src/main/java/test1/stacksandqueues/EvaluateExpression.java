package test1.stacksandqueues;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

/**
 * Created by 1100383 on 2017. 4. 10..
 */


class Solution {
    public int evalRPN(ArrayList<String> c) {
        Stack<String> a = new Stack<>();

        if (c.size() == 0)
            return 0;

        int k = 0;

        while (c.size() > k) {
            String token = c.get(k++);

            if (token.compareTo("+") == 0) {
                String v1 = a.pop();
                String v2 = a.pop();
                a.add(((Integer) (Integer.parseInt(v1) + Integer.parseInt(v2))).toString());
            } else if (token.compareTo("-") == 0) {
                String v1 = a.pop();
                String v2 = a.pop();
                a.add(((Integer) (Integer.parseInt(v2) - Integer.parseInt(v1))).toString());
            } else if (token.compareTo("*") == 0) {
                String v1 = a.pop();
                String v2 = a.pop();
                a.add(((Integer) (Integer.parseInt(v1) * Integer.parseInt(v2))).toString());
            } else if (token.compareTo("/") == 0) {
                String v1 = a.pop();
                String v2 = a.pop();
                a.add(((Integer) (Integer.parseInt(v2) / Integer.parseInt(v1))).toString());
            } else {
                a.push(token);
            }
        }
        return Integer.parseInt(a.get(0));
    }
}

public class EvaluateExpression {
    public static void main(String[] arg) {


        Solution sol = new Solution();
        System.out.println(sol.evalRPN(new ArrayList<String>(Arrays.asList("2", "1", "+", "3", "*"))));
    }
}
