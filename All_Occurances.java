public class All_Occurances{
    public static void All_Occurances(int arr[],int i,int key){
        if(i==arr.length){
            return;
        }
        if(arr[i]==key){
            System.out.println(i);
        }  
        All_Occurances(arr,i+1,key);

        //All_Occurances(arr,i+1,key);
         
    }
    public static void main(String args[]){
        int arr[] = {3,2,4,5,6,2,7,2,2};
        int key = 2;
        All_Occurances( arr,0,key);
    }
}