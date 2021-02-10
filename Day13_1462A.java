import java.util.Scanner;
public class Day13_1462A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for(int i = 0 ; i < T ; i++){
            int n = scan.nextInt();
            int[] arr = new int[n];
            for(int j = 0 ; j < n ; j++)
                arr[j] = scan.nextInt();
             int left = 0 ;
             int right = n-1;
             int[] seq = new int[n];
             for(int k = 0 ; k < n ; k++){
                 if(k % 2 == 0){
                     seq[k] = arr[left];
                     left++ ;
                 }
                 else{
                     seq[k] = arr[right] ;
                     right -- ;
                 }
             }
             for(int j = 0 ; j < n ; j++)
                System.out.print(seq[j] +" ");
               System.out.println("");  
        }
         
    }
}
