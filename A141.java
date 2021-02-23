import java.util.Scanner;

public class A141 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int[] alpha = new int[26];
        String str = scan.nextLine();
        int total = str.length();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int n = alphabets.indexOf(ch);
            alpha[n]++;

        }
        str = scan.nextLine();
        total = total + str.length();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int n = alphabets.indexOf(ch);
            alpha[n]++;
        }
        str = scan.nextLine();
        if (total != str.length())
            System.out.println("NO");
        else {
            int flag = 0;
            int[] count = new int[26];
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                int n = alphabets.indexOf(ch);
                count[n]++;
            }
            for (int i = 0; i < 26; i++) {
                if (alpha[i] != count[i]) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 1)
                System.out.println("NO");
            else
                System.out.println("YES");
        }

    }
}