import java.util.Scanner;
import java.util.Arrays;

public class Day6_149A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        int[] months = new int[12];
        int total = 0;
        for (int i = 0; i < 12; i++) {
            months[i] = scan.nextInt();
            total = total + months[i];
        }
        if (k == 0) {
            System.out.println(0);
            System.exit(0);
        }
        if (k > total) {
            System.out.println(-1);
            System.exit(0);
        }
        Arrays.sort(months);
        int count = 0;
        int sum = 0;

        for (int i = 11; i >= 0; i--) {
            sum = sum + months[i];
            count++;
            if (sum >= k) {
                break;
            }
        }
        System.out.println(count);

    }
}