import java.util.*;
public class x_power_n{

    public static int Optimized_Power(int x, int n){
        if(n==0){
            return 1;
        }
        int halfPower = Optimized_Power(x,n/2);
        int halfPowerSq = halfPower*halfPower;
        if(n%2 != 0){
            halfPowerSq = x*halfPowerSq;
        }
        return halfPowerSq;
    }


    public static void main(String args[]){
Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base value: ");
        int x = sc.nextInt();
        System.out.print("Enter the power value: ");
        int n = sc.nextInt();
    System.out.println(x + " power " + n + " is: " + Optimized_Power(x,n));
    }
}