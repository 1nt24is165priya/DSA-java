public class Majority_Element{
    public static int majorityElement(int nums[]){
        Sort_arrOf_nums(nums,0,nums.length-1);
        int mid = nums.length / 2;
int count = 1;
int i = mid - 1;
int ei = nums.length - 1;
int si = 0;

        
            while (i >= si && nums[i] == nums[mid]) {
                         count++;
                         i--;
            }
        
        
       
            i=mid+1;
            while (i <= ei && nums[i] == nums[mid]) {
                     count++;
                     i++;
            }
        

        if (count > nums.length / 2) {
            return nums[mid];
        }

        return nums[mid];



}
        public static void Sort_arrOf_nums(int nums[],int si,int ei){
        if(si>=ei){
            return ;
        }
        int mid = si + (ei-si)/2;
        Sort_arrOf_nums(nums,si,mid);
        Sort_arrOf_nums(nums,mid+1,ei);
        Merge(nums,si,mid,ei);
    }

    public static void Merge(int nums[], int si, int mid, int ei){
        int temp[] = new int[ei-si+1];
        int i = si;
        int j = mid+1;
        int k =0;
        while(i<=mid && j<=ei){
            if(nums[i] < nums[j]){
                temp[k] = nums[i];
                i++;
            }
            else{
                temp[k] = nums[j];
                j++;
            }
            k++;
        }

        while(i<=mid ){
            temp[k++]=nums[i++];
        }
        while(j<=ei){
            temp[k++]=nums[j++];
        }

        for(k=0, i=si; k<temp.length; k++,i++){
            nums[i] = temp[k];
        }
    }


    


    public static void main (String args[]){
        int nums[] = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));

    }
}