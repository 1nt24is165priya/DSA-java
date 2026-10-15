import java.util.*;
public class Friends_Pairing{
    public static int friends_pairing(int n){
    if(n==1 || n==2){
        return n;
    }

    int fnm1 = friends_pairing(n-1);
    int fnm2 = friends_pairing(n-2);
    int pairWays = (n-1)*fnm2;

    int total_ways = fnm1 + pairWays;
    return total_ways;
}

public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of people: ");
    int n = sc.nextInt();
    System.out.println("Total number of ways: " + friends_pairing(n));

}
}