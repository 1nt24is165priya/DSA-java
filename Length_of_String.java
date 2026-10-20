public class Length_of_String {

    public static int Length_of_String(String str, int i) {
        if (i == str.length()) {
            return 0;
        }

        return 1 + Length_of_String(str, i + 1);
    }

    public static void main(String args[]) {
        String str = "PriyaShekar R C";

        System.out.println("Length of a string is: " + Length_of_String(str, 0));
    }
}