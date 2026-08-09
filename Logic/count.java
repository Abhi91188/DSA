import java.util.*;
public class count {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter fast num");
        int i = sc.nextInt();
        System.out.print("enter second num");
        int j = sc.nextInt();
        int sum = 0;
        for ( i=i; i<=j; i++){
            if ( i%2==0){

                sum++;

                System.out.println(i);
                
            }
        }
           System.out.println("the total even num "+sum);
    }
}