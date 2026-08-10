// print odd num from 1 to n

import java.util.*;

public class oddnum {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number");
        int n= sc.nextInt();
        System.out.println("the series off odd number");
        for (int i=1; i<=n; i++){
            if(i % 2==1){
               
                
                System.out.println(i);
            }
        }
    }
}
