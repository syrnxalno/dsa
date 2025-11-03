public class ReverseNumber {

    // printing number in reverse (no returns)
    static void rev(int n) {
        if(n==0){
            return;
        }
        int lastDigit = n % 10;
        System.out.print(lastDigit);
        rev(n / 10);
    }

    // returns the reversed number
    static int revNum = 0;
    static int reverse(int n){
        if(n==0){
            return revNum;
        }
        int lastDigit = n % 10;
        revNum = revNum * 10 + lastDigit;
        return reverse(n/10);
    }

    public static void main(String args[]){
        int n = 18452;
        System.out.println(reverse(n));
        rev(n);
    }
}