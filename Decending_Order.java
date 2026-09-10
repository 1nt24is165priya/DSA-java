import java.util.*;
public class Decending_Order{

    public static void descending_Order(int n){
        System.out.println(n);
        if(n==1){
            return ;
        }
        else{
            descending_Order(n-1);
        }
    }
    public static void  main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        descending_Order(n);


    }

}