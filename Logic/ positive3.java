// sum off negative num 

import java.util.*;

public class postive2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the fist num");
        int i = sc.nextInt();
        System.out.println("enter the secin num");
        int j = sc.nextInt();
        int sum = 0;
        for (i=i; i<=j; i++){
            if (i<0){
                sum= sum+i;

            }
        }System.out.println("the sum of negative num "+ "  = "+ sum );


    }
    
}
