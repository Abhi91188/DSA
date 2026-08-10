// check th num is positiv our nigative

import java.util.*;

public class positive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printp("enter the number ");
        int i = sc.nextInt();

        if (i>=0){
            System.out.println("the number is positive");
        }else{
            System.out.println("the number is nigative");
        }

    }
}
