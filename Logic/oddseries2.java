//summ off odd num form 1 to n

import java.util.Scanner;
import java.util.concurrent.*;

 public class oddseries2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        System.out.print("enter the number ");
        int n = sc.nextInt();
        int sum = 0;
         for ( int i=1; i<=n; i++){
            if (i%2 !=0){

               System.out.println(i);
                 sum = sum + i;
            }
         }      System.out.println("the sum off 1 to given odd num "+ " = "+     sum);

    }
    
}
