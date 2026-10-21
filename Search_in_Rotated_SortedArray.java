public class Search_in_Rotated_SortedArray{
    
    public static int M_binSearch(int[] nums, int target,int si,int ei){
        if(si>ei){
            return -1;
        }
        int mid = si + (ei-si)/2;
        if(target==nums[mid]){
            return mid;
        }
        //mid on L1;
        if(nums[si] <= nums[mid]){
            //case a:
            if(nums[si] <= target && target <= nums[mid]){
                return M_binSearch(nums,target,si,mid-1);
            }
            //case b:
            else{
                return M_binSearch(nums,target,mid+1,ei);
            }
        }

        else{
            //case c:
            if(target>=nums[mid] && target<=nums[ei]){
                return M_binSearch(nums,target,mid+1,ei);
            }
            else{
                return M_binSearch(nums,target,si,mid-1);
            }

        }
        
        
    }


public static void main(String args[]){
    int nums[] ={4,5,6,7,0,1,2};
    int target = 0;
    System.out.println(M_binSearch(nums,target,0,nums.length-1));
}
}
