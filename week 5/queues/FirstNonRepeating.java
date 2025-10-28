import java.util.*;
import java.util.Queue;

public class FirstNonRepeating {
    public static void main(String[] args) {
        String stream = "aabcdb";
        
        // queue for storing characters in order of arrival
        Queue<Character> q = new LinkedList<>();
        Map<Character, Integer> freqMap = new HashMap<>();
        
        for (char ch : stream.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
            q.add(ch);
            
            // remove all characters from front that are repeating
            while (!q.isEmpty() && freqMap.get(q.peek()) > 1) {
                q.remove();
            }
        }
        
        // the front of the queue is the first non repeating character
        if (!q.isEmpty()) {
            System.out.println("First non-repeating character: " + q.peek());
        } else {
            System.out.println("No non-repeating character found.");
        }
    }
}
