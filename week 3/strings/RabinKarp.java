package strings;

public class RabinKarp {
    public static void main(String args[]) {
        String str = "abbcdbdeddfab";
        String pattern = "dedd";
        searchPattern(str, pattern);
    }

    public static void searchPattern(String str, String pattern) {
        int n = str.length();
        int m = pattern.length();
        int q = 101;
        int hash_s = 0, hash_p = 0, h = 1, d = 256;

        // precompute weight
        for (int i = 0; i < m - 1; i++) {
            h = (h * d) % q;
        }

        // hash value for pattern and text
        for (int i = 0; i < m; i++) {
            hash_p = (pattern.charAt(i) + d * hash_p) % q;
            hash_s = (str.charAt(i) + d * hash_s) % q;
        }

        for (int i = 0; i <= n - m; i++) {

            // check the hash values of current windows of text and pattern.
            if (hash_p == hash_s) {
                int j;
                for (j = 0; j < m; j++) {

                    if (str.charAt(i + j) != pattern.charAt(j))
                        break;
                }

                // if pattern == text
                if (j == m)
                    System.out.println("Pattern is found at index : " + i);
            }
            // add leading digit and remove trailing digit
            if (i < n - m) {
                hash_s = (d * (hash_s - str.charAt(i) * h) + str.charAt(i + m)) % q;

                // converting negative value of hash_t to positive.
                if (hash_s < 0)
                    hash_s = (hash_s + q);
            }
        }
    }
}
