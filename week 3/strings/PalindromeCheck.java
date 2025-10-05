package strings;
public class PalindromeCheck {
    public static void main(String[] args) {
        String str = "Racecar";
        if(checkPalindrome(str)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
    // stringbuilder + character array 
    public static boolean checkPalindrome(String str){
        str = str.toLowerCase();
        char ch[] = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i=ch.length-1;i>=0;i--){
            sb.append(ch[i]);
        }
        if(str.equals(sb.toString())){
            return true;
        }
        return false;
    }
    // two pointers (O(1) space complexity)
    public static boolean isPalindrome(String str){
        str = str.toLowerCase();
        char ch[] = str.toCharArray();
        int left = 0, right = ch.length-1;
        while(left<right){
            if(ch[left]!=ch[right]){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

}
