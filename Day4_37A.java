import java.util.Scanner;
import java.lang.Math;

public class Day4_37A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] A = new int[n];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            A[i] = scan.nextInt();
            if (A[i] > max)
                max = A[i];
        }

        int[] count = new int[max + 1];
        for (int i = 0; i < n; i++)
            count[A[i]]++;

        int[] res = new int[2];
        for (int i = 0; i < max + 1; i++) {
            if (count[i] > 0)
                res[1]++;

            if (count[i] > res[0])
                res[0] = count[i];
        }

        for (int a : res)
            System.out.print(a + " ");

    }

}
