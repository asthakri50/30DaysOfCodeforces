import java.util.Scanner;

public class Day9_230A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int n = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i] < a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                    int temp2 = b[i];
                    b[i] = b[j];
                    b[j] = temp2;
                }
            }
        }
        boolean bool = false;
        for (int i = 0; i < n; i++) {
            if (a[i] >= s) {
                bool = true;
                System.out.println("NO");
                return;
            } else {
                s = s + b[i];
            }
        }
        if (bool == false)
            System.out.println("YES");
    }
}
