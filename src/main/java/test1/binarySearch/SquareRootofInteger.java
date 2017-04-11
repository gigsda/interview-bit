package test1.binarySearch;

/**
 * Created by 1100383 on 2017. 4. 10..
 */
public class SquareRootofInteger {

    public static int sqrt(int a) {
        int f=-1;
        double x = 1;
        int k = 10;

        while (true) {
            System.out.println(x);
            x = (x + (a / x)) / 2;
            if (((int)x) == f)
                break;
            f = (int)x;

            k -= 1;

        }

        return (int)x;
    }

    public static void main(String [ ] arg) {
        System.out.println("result:"+sqrt(1100));
    }
}
