
public class Find_SubsetsOptimized {

    public static void findSubsets(String str, int i, StringBuilder ans) {

        // Base condition
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("null");
            } else {
                System.out.println(ans);
            }
            return;
        }

        // Choice Yes: Include the current character
        ans.append(str.charAt(i));
        findSubsets(str, i + 1, ans);

        // Backtracking: Remove the last added character
        ans.deleteCharAt(ans.length() - 1);

        // Choice No: Exclude the current character
        findSubsets(str, i + 1, ans);
    }

    public static void main(String args[]) {
        String str = "abc";
        StringBuilder ans = new StringBuilder();

        findSubsets(str, 0, ans);
    }
}
