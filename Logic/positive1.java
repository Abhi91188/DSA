// count the num  positive ore nigetive 

import java.util.*;
public class positive1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the fist number ");
        int i = sc .nextInt();
        System.out.print("enter the second num");
        int j = sc.nextInt();
        int count =0;
        int count1 =0;
        for( i=i; i<=j; i++){
         if (i>0){
            System.out.println(i);
            count++;
            
         } else if ( i<0 ){
            System.out.println(i);
              count1++;
            }
        }   System.out.println(" the totle positive  num" + " = " + count);
            System.out.println(  "the totle negatitve num " +" = "+ count1);
    }

    
    
}
