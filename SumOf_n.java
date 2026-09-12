import java.util.*;
public class SumOf_n{

    public static int SumOf_n(int n){
        if(n==0){
            return 0;
        }
        else{
            return n+SumOf_n(n-1);

        }



    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr n value:");
        int n = sc.nextInt();
        //int sum =0;
        System.out.println(SumOf_n(n));

    


    }

}