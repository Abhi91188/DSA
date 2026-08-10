// count off odd number form between two number 

import java.util.*;
public class oddseries3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the faist number ");
        int i = sc.nextInt();
        System.out.print("enter the the secand number ");
        int n = sc.nextInt();
        int count = 0;
        System.out.println("this is odd num");
        for(i=i; i<=n; i++){
            if (i%2 !=0){
                System.out.println(i);
                count++;
            }
        } System.out.println(" And this is totle odd num is " + " = "+ count);
    }
    
}
