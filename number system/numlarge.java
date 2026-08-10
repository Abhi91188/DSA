//find the largest off two number

import java.util.*;
public class numlarge {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the fist num");
        int i = sc.nextInt();
        System.out.println("enter the second num");
        int j = sc.nextInt();
        if(i>j){
            System.out.println("Largest Number "+i);

        }else{
            System.out.println("Largest Number "+j);
        }
        
    }
    
}
