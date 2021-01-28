import java.util.Scanner;

public class Day5_63A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        String[] res = new String[n];
        String[] prefix = new String[n];
        String[] suffix = new String[n];
        for (int i = 0; i < n; i++) {
            prefix[i] = scan.next();
            suffix[i] = scan.nextLine();
        }

        int j = 0;
        for (int i = 0; i < n; i++) {

            if (" rat".equals(suffix[i])) {
                res[j] = prefix[i];
                j++;
            }
        }
        for (int i = 0; i < n; i++) {
            if (suffix[i].equals(" woman") || suffix[i].equals(" child")) {
                res[j] = prefix[i];
                j++;
            }
        }
        for (int i = 0; i < n; i++) {
            if (suffix[i].equals(" man")) {
                res[j] = prefix[i];
                j++;
            }
        }
        for (int i = 0; i < n; i++) {
            if (suffix[i].equals(" captain")) {
                res[j] = prefix[i];
                j++;
            }
        }
        for (int i = 0; i < n; i++)
            System.out.println(res[i]);

    }
}