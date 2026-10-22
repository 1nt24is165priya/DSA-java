public class MergeSort_arrOf_Strings{
    public static void printArr(String arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void Sort_arrOf_Strings(String arr[],int si,int ei){
        if(si>=ei){
            return ;
        }
        int mid = si + (ei-si)/2;
        Sort_arrOf_Strings(arr,si,mid);
        Sort_arrOf_Strings(arr,mid+1,ei);
        Merge(arr,si,mid,ei);
    }

    public static void Merge(String arr[], int si, int mid, int ei){
        String temp[] = new String[ei-si+1];
        int i = si;
        int j = mid+1;
        int k =0;
        while(i<=mid && j<=ei){
            if(arr[i].compareTo(arr[j])<0){
                temp[k] = arr[i];
                i++;
            }
            else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        while(i<=mid ){
            temp[k++]=arr[i++];
        }
        while(j<=ei){
            temp[k++]=arr[j++];
        }

        for(k=0, i=si; k<temp.length; k++,i++){
            arr[i] = temp[k];
        }
    }


    public static void main(String args[]){
        String arr[] ={"sun", "earth", "mars", "mercury"};
        Sort_arrOf_Strings(arr,0,arr.length-1);
        printArr(arr);
    }
}