import java.util.Scanner;

public class Day13_1453A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
         
        for (int j = 0; j < T; j++) {
            int n = scan.nextInt();
            int m = scan.nextInt();
            int[] num = new int[101];

            for (int i = 0; i < n; i++)
                num[scan.nextInt()]++;
            for (int i = 0; i < m; i++)
                num[scan.nextInt()]++;
            int cnt = 0;
            for (int i = 0; i < 101; i++) {
                if (num[i] > 1){
                    cnt++;
                }
            }
            System.out.println(cnt);
        }

    }
}
