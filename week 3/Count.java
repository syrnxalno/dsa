public class Count {
    public static void main(String[] args) {
        String str = "Pasta la vista!";
        countTextElements(str);
    }

    // public static void countTextElements(String str) {
    //     int vow = 0, con = 0, words = 0;
    //     boolean wordStart = false;
    //     char[] ch = str.toCharArray();
    //     for (int i = 0; i < ch.length; i++) {
    //         // count vowels
    //         if (String.valueOf(ch[i]).matches("[aeiouAEIOU]")) {
    //             vow++;
    //         // count consonants
    //         } else if (String.valueOf(ch[i]).matches("[a-zA-Z]")) {
    //             con++;
    //         }
    //         // count words
    //         if (String.valueOf(ch[i]).matches("\\s")) {
    //             wordStart = false;
    //         } else {
    //             if (!wordStart) {
    //                 words++;
    //                 wordStart = true;
    //             }
    //         }
    //     }
    //     System.out.println("Vowels : " + vow + "\nConsonants : " + con + "\nWords : " + words);
    // }

    public static void countTextElements(String str) {
    int vow = 0, con = 0, words = 0;
    boolean inWord = false;

    for (char c : str.toCharArray()) {
        if ("aeiouAEIOU".indexOf(c) != -1) vow++;
        else if (Character.isLetter(c)) con++;

        if (Character.isWhitespace(c)) inWord = false;
        else if (!inWord) {
            words++;
            inWord = true;
        }
    }
    System.out.println("Vowels : " +vow + "\nConsonants : " +con + "\nWords : " +words);
}


}
