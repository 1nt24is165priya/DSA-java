import java.util.*;
public class Tiling_Problem{
    public static int tiling_prob(int n){
        if(n==0 || n==1){
            return 1;
        }
//for vertical arrangement
        int fnm1 = tiling_prob(n-1);
//for horizontal arrangement
        int fnm2 = tiling_prob(n-2);
        int total_ways = fnm1 + fnm2;
        return total_ways;
    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the floor: ");
        int n = sc.nextInt();
        System.out.println("Number of ways tiles can be arranged are: " + tiling_prob(n));
    }
}