1erpublic class Last_Occurance{

    public static int Last_Occ(int arr[], int i, int key){
        if(i==arr.length){
            return -1;
        }
        int isFound = Last_Occ(arr,i+1,key);
        if(isFound == -1 && arr[i] == key){
            return i;
        }

        return isFound;
    }

    public static void main(String[] args){
        int arr[] ={1, 3, 7,19,5,77,80,12,5,6};
        int key=5;
        System.out.println(Last_Occ(arr,0,key));
    }
}