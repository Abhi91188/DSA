import java.util.*;

public class Even3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("enter start num");
        int i= sc.nextInt();
        System.out.print("enter end num");
        int n= sc.nextInt();
        for( i=i; i<=n; i++){
            if( i %2 == 0){
                System.out.println(i);
            }
        }
    }
    
}
