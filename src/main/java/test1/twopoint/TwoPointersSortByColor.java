package test1.twopoint;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by 1100383 on 2017. 4. 10..
 */


class Solution {
/////////////

    public static void quickSort(Integer[] arr, int low, int high) {
        if (arr == null || arr.length == 0)
            return;

        if (low >= high)
            return;

        // pick the pivot
        int middle = low + (high - low) / 2;
        int pivot = arr[middle];

        // make left < pivot and right > pivot
        int i = low, j = high;
        while (i <= j) {
            while (arr[i] < pivot) {
                i++;
            }

            while (arr[j] > pivot) {
                j--;
            }

            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        // recursively sort two sub parts
        if (low < j)
            quickSort(arr, low, j);

        if (high > i)
            quickSort(arr, i, high);
    }


    public void sortColors(ArrayList<Integer> a) {
        Integer[] input = a.toArray(new Integer[a.size()]);

        quickSort(input ,0,a.size()-1);

        a.clear();
        a.addAll(Arrays.asList(input));
    }

    private void asort(ArrayList<Integer> a) {
        int n = a.size();
        for (int i = 0;i < n-1;  i++){

            for(int j = i+1;j < n; j++){
                if (a.get(i) > a.get(j)) {
                    int t = a.get(i);
                    a.set(i, a.get(j));
                    a.set(j, t);
                }
            }
        }
    }
////////////
}

public class TwoPointersSortByColor {
    public static void main(String[] arg) {
        Solution sol = new Solution();
        ArrayList<Integer> ar = new ArrayList<Integer>(Arrays.asList(8,2,3,5,6,7,8));
        sol.sortColors(ar);
        System.out.println(ar);
    }
}
