import java.util.Scanner;
import java.util.Arrays;

public class 984A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scan.nextInt();
        scan.close();

        Arrays.sort(arr);

        System.out.println(arr[(n - 1) / 2]);

    }
}