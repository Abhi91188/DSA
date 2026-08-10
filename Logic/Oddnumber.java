import java.util.*;
public class Oddnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the num ");
        int n = sc.nextInt();
             if (n%2==1){
                System.out.println("the num is odd");
                System.out.println("the given number is "+n);
             } else{
                System.out.println("invalid num please enter a valid num because my be is a even num");
             }
    }
    
}
