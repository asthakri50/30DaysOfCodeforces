import java.util.Scanner ;
import java.lang.Math;
public class Day14_1440A {
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in) ; 
    int T = scan.nextInt() ;
    for(int i = 0 ; i < T ; i++){
        int n = scan.nextInt() ;
        int Co = scan.nextInt() ;
        int C1 = scan.nextInt() ;
        int h = scan.nextInt() ;

        String str = scan.next(); 
       
        int cnt0 = 0 ;
        int cnt1 = 0 ;
        for(int j = 0 ; j < n ; j++){
            if(str.charAt(j) == '0')
                cnt0++ ;
              else
                cnt1++ ;  
        }
        int a = Co * cnt0 + C1 * cnt1 ;
        int b = cnt0 * h + n * C1 ;
        int c = cnt1 * h + n * Co ;
           

         System.out.println(Math.min(a , Math.min(b , c) ) ) ;   
    }
}    
}
