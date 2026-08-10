// print odd num from 1 to n 

import java.util.*;

public class oddseries {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter fist number ");
        int i = sc.nextInt();
        System.out.print("enter the secand number");
        int n= sc.nextInt();
        System.out.println("the odd series of given num");

        for (i=i; i<=n; i++){

            if (i % 2==1){
                System.out.println(i);
            }
        }

    }
    
}
