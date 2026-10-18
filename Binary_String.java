public class Binary_String{
    public static void Binary_string(int n, int lastplace,String str){
        if(n==0){
            System.out.println(str);
            return;
        }
        Binary_string(n-1,0,str+"0");
        if(lastplace == 0){
            Binary_string(n-1,1,str+"1");
        }
    }

    public static void main(String args[]){
        Binary_string(4,0, "");
    }
}