import java.util.*;

public class Day8_169A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a = scan.nextInt();
        int b = scan.nextInt();

        int[] chores = new int[n];
        for (int i = 0; i < n; i++)
            chores[i] = scan.nextInt();

        scan.close();
        Arrays.sort(chores);
        if (chores[b - 1] == chores[n - a])
            System.out.println(0);
        else
            System.out.println(chores[n - a] - chores[b - 1]);
    }
}
