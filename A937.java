import java.io.*;
import java.util.*;

public class A937 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scan.nextInt();
        scan.close();

        ArrayList<Integer> al = new ArrayList<Integer>();
        for (int a : arr) {
            if (a == 0 || al.contains(a))
                continue;
            else
                al.add(a);
        }
        System.out.println(al.size());

    }
}
