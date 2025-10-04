public class NaivePatternSearch{
    public static void main(String[] args) {
        String str = "abcaaabababcac";
        String pattern = "bca";
        patternSearch(str, pattern);
    }

    public static void patternSearch(String str, String pattern){
        int n = str.length();
        int m = pattern.length();

        for(int i=0;i<=n-m;i++){
            int j = 0;
            for(j=0;j<m;j++){
                if(str.charAt(i+j)!=pattern.charAt(j)){
                   break;
                }
            }
            if (j == m) { 
                System.out.println("Pattern found at index: " + i);
            }
        }
    }
    
}
