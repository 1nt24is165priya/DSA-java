import java.util.*;
public class Factorial{

    public static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
         return n*factorial(n-1); 
        }
    }

    public static void main(String args[]){
        System.out.println("Enter value of n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("factorial of " + n + " is: " + factorial(n));
        

    }
}