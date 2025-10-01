import java.util.Arrays;
public class AnagramCheck {
    public static void main(String[] args) {
        String str1 = "Restful";
        String str2 = "Fluster";
        if(anagramCheck(str1, str2)){
            System.out.println("Anagrams");
        }else{
            System.out.println("Not anagrams");
        };
    }
    // brute force approach
    public static boolean anagramCheck(String str1, String str2){
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        char ch1[] = str1.toCharArray();
        char ch2[] = str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        for(int i=0,j=0;i<=ch1.length-1 && j<=ch2.length-1;i++,j++){
            if(ch1[i]!=ch2[j]){
                return false;
            }
        }
        return true;
    }
}
