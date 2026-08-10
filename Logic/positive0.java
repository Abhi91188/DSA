// check the num is positive ore nigetive or zero

import java.util.*;
public class positive0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number ");
        int i = sc .nextInt();
        if (i>0){
            System.out.println("the number is positive " + " _ "   +i);

        }else if (i<0){
            System.out.println("the number is negetive"+ " _ "+  i);
        }else{
            System.out.println("the number is zero"+ " _ "+ i);
        }

    }
    
}
