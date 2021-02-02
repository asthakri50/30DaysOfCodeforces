
import java.util.Scanner;
import java.util.Arrays;

public class Day10_234B {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] lights = new int[n];
        int[] hours = new int[n];
        for (int i = 0; i < n; i++) {
            lights[i] = scan.nextInt();
            hours[i] = i + 1;
        }

        for (int i = 0; i < n - 1; i++) {
            int j = i;
            while (j >= 0 && lights[j] > lights[j + 1]) {
                int temp = lights[j];
                lights[j] = lights[j + 1];
                lights[j + 1] = temp;
                int temp2 = hours[j];
                hours[j] = hours[j + 1];
                hours[j + 1] = temp2;
                j--;
            }
        }

        System.out.println(lights[n - k]);
        int[] ans = new int[k];
        int j = n - k;
        for (int i = 0; i < k; i++) {
            ans[i] = hours[j];
            j++;
        }
        Arrays.sort(ans);
        for (int i = 0; i < k; i++)
            System.out.print(ans[i] + " ");
    }
}
