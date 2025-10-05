public class kmp {
    public static void main(String args[]) {
        String str = "abcdefabdabfffgh";
        String pattern = "abdabf";
        searchPattern(str, pattern);
    }

    public static int[] computeLps(String pattern) {
        int m = pattern.length();
        int lps[] = new int[m];
        int i = 1, j = 0;

        while (i < m) {
            if (pattern.charAt(i) == pattern.charAt(j)) {
                lps[i] = j + 1;
                j++;
                i++;
            } else {
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }

    public static void searchPattern(String str, String pattern) {
        int n = str.length();
        int m = pattern.length();
        int[] lps = computeLps(pattern);
        int i = 0, j = 0;

        while (i < n) {
            if (str.charAt(i) == pattern.charAt(j)) {
                i++;
                j++;
            } else {
                if (j != 0) {
                    j = lps[j - 1]; 
                } else {
                    i++; 
                }
            }
            if (j == m) {
                System.out.println("Index where pattern is found: " + (i - j));
                j = lps[j - 1]; 
            }
        }
    }

}