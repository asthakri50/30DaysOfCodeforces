import java.util.Scanner;
import java.util.Arrays;

public class A160 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum = 0;
        int[] coins = new int[n];
        for (int i = 0; i < n; i++) {
            coins[i] = scan.nextInt();
            sum = sum + coins[i];
        }
        scan.close();
        Arrays.sort(coins);
        int  postsum = 0;
        int num = 0;
        for (int i = n - 1; i >= 0; i--){
            num++;
            postsum = postsum + coins[i];
            if (postsum > sum - postsum) {
                System.out.println(num);
                System.exit(0);
            }
        }

    }
}