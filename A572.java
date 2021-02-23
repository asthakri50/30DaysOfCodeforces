import java.util.*;
public class A572 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        scan.nextLine();
        int[] A = new int[a];
        int[] B = new int[b];

        int k = scan.nextInt();
        int m = scan.nextInt();
        scan.nextLine();

        for (int i = 0; i < a; i++)
            A[i] = scan.nextInt();
        scan.nextLine();

        for (int i = 0; i < b; i++)
            B[i] = scan.nextInt();
        scan.close();
        if (A[k - 1] < B[b - m])
            System.out.println("YES");
        else
            System.out.println("NO");

    }
}