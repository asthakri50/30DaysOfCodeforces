import java.util.*;
import java.lang.*;

public class Day12_1411A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();

        for (int i = 0; i < test; i++) {
            int n = scan.nextInt();
            String str = scan.next();
            int count = 0;
            for (int j = n - 1; j >= 0; j--) {
                if (str.charAt(j) == ')')
                    count++;
                else
                    break;
            }
            if (count > (n - count))
                System.out.println("YES");
            else
                System.out.println("NO");
        }

    }

}