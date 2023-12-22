import java.util.HashMap;
import java.util.Map;

public class TaskThree {

    public static int lengthOfLongestSubstring(String s) {

        int maxLength = 0;
        Map<Character, Integer> charMap = new HashMap<>();
        int left = 0;

        for (int i = 0; i <  s.length(); i++) {
            if (!charMap.containsKey(s.charAt(i)) || charMap.get(s.charAt(i)) < left) {
                charMap.put(s.charAt(i), i);
                maxLength = Math.max(maxLength, i - left + 1);
            } else {
                left = charMap.get(s.charAt(i)) + 1;
                charMap.put(s.charAt(i), i);
                charMap.clear();
            }

        }

        return maxLength;
    }

    public static void main(String[] args){
        System.out.println(lengthOfLongestSubstring("abajfgcfdhfhdjfskvgeafga"));
    }

}
