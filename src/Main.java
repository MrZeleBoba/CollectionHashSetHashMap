import java.util.HashMap;
import java.util.Map;


public class Main {

    public static final String TEXT = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

    public static void main(String[] args) {
        Map<Character, Integer> frequency = new HashMap<>();

        for (int i = 0; i < TEXT.length(); i++) {
            char c = TEXT.charAt(i);
            if (!Character.isLetter(c)) {
                continue;
            }
            if (frequency.containsKey(c)) {
                frequency.put(c, frequency.get(c) + 1);
            } else {
                frequency.put(c, 1);
            }
        }
        int max = -1;
        char maxC = 0;
        for (char c : frequency.keySet()) {
            int freq = frequency.get(c);
            if (freq > max) {
                max = freq;
                maxC = c;
            }
        }
        int min = Integer.MAX_VALUE;
        char minC = 0;
        for (char c : frequency.keySet()) {
            int freq = frequency.get(c);
            if (freq < min) {
                min = freq;
                minC = c;
            }
        }
        System.out.println("Макс.Частота " + maxC + ":" + max);
        System.out.println("Макс.Частота " + minC + ":" + min);
    }


}






