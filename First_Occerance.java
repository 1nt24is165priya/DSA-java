public class First_Occerance{
    public static int first_Occ(int arr[], int i,int key){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        else{
                  return first_Occ(arr,i+1,key);
        }
        

    }

    public static void main(String args[]){
        int arr[] ={1, 3, 7,19,5,77,80,12,5,6};
        int key=2;
        System.out.println(first_Occ(arr,0,key));
    }
}