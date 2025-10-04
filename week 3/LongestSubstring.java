import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {
    public static void main(String[] args) {
        String str = "sdfsfdffherrbpvnqt";
        longestSubstring(str);
    }

    public static void longestSubstring(String str) {
        int max = 0;
        String longest = "";

        for (int i = 0; i < str.length(); i++) {
            Set<Character> ans = new HashSet<>();
            StringBuilder current = new StringBuilder();

            for (int j = i; j < str.length(); j++) {
                if (ans.contains(str.charAt(j))) {
                    break; 
                }

                ans.add(str.charAt(j));
                current.append(str.charAt(j));
            }

            if (current.length() > max) {
                max = current.length();
                longest = current.toString();
            }
        }

        System.out.println("Longest substring is \"" + longest + "\" with length " + max);
    }

    public static void longestSub(String str){
        // sliding window technique
    }
}
