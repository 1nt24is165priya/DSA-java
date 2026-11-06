public class Find_Subsets{
    public static void findSubsets(String str, int i, String ans){
        if(i==str.length()){
            if(ans.length() == 0){
                System.out.println("null");
            }
            else{
                System.out.println(ans);
                
            }
            return;
        }
        findSubsets(str, i+1, ans+str.charAt(i)); //choice Yes
        findSubsets(str,i+1,ans); //Choice No
    }
    public static void main(String args[]){
        String str = "abc";
        findSubsets(str,0,"");

    }
}