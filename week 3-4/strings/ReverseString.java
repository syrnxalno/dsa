package strings;
import java.lang.StringBuilder;
public class ReverseString {
    public static void main(String[] args) {
        String str = "Repulsive";
        revString(str);
        // reverse(str);
    }

    // using stringbuilder
    public static void revString(String str){
        StringBuilder sb = new StringBuilder();
        char ch[] = str.toCharArray();
        for(int i=ch.length-1;i>=0;i--){
            sb.append(ch[i]);
        }
        System.out.println("Reversed String: "+sb.toString());
    }

    // two pointer method
    public static void reverse(String str){
        int left = 0, right = str.length()-1;
        char ch[] = str.toCharArray(); 
        while(left<right){
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            left++;
            right--;
        }
        String rev = new String(ch);
        System.out.println("Reversed String: "+rev);
    }
}
