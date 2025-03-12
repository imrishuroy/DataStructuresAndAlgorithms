package sliding_window;

import java.util.HashMap;
import java.util.Map;

public class LengthOfLongestSubstringTwoDistinct {

    public static void main(String[] args) {

        System.out.println(LengthOfLongestSubstringTwoDistinct.lengthOfLongestSubstringTwoDistinct("eceba")); // Output: 3
        System.out.println(LengthOfLongestSubstringTwoDistinct.lengthOfLongestSubstringTwoDistinct("ccaabbb")); // Output: 5

    }


    /*

    Approach:
    Sliding Window Technique:

    We maintain a window [left, right] that expands by moving the right pointer to include new characters.
    If the window contains more than two distinct characters, we shrink it from the left by moving the left pointer until it again contains at most two distinct characters.
    HashMap for Character Frequency Tracking:

    A HashMap (charCount) is used to store character frequencies, allowing quick access to the count of each character in the window.
    This helps in efficiently removing characters when they drop to a frequency of zero.
    Updating Maximum Length:

    At each step, we update maxLength to store the longest valid substring seen so far.
    Why Not Use a Set and Why Use a HashMap?
    Set Limitations:

    A Set<Character> can only tell us whether a character is present or not, but it does not track the count of characters.
    When trying to shrink the window, we need to know when a character count becomes zero before removing it, which a Set does not support efficiently.
    Why HashMap?

    A HashMap allows us to track the frequency of characters efficiently.
    It provides quick lookups (O(1)) for checking and updating character counts.
    When a character's frequency reaches zero, we can remove it, keeping the window valid.
    Time Complexity:

    O(N), where N is the length of the string. Each character is added and removed from the HashMap at most once.
    Space Complexity:

    O(1), since at most 3 characters (2 distinct + 1 temporary) can be in the HashMap at any time.


     */

    public static int lengthOfLongestSubstringTwoDistinct (String s){
            // Edge case: If string is empty or null, return 0
            if (s == null || s.length() == 0) {
                return 0;
            }

            // HashMap to store character frequency in the current window
            Map<Character, Integer> charCount = new HashMap<>();
            int maxLength = 0;
            int left = 0; // Left pointer of the sliding window

            // Iterate through the string with the right pointer
            for (int right = 0; right < s.length(); right++) {
                char currentChar = s.charAt(right);
                charCount.put(currentChar, charCount.getOrDefault(currentChar, 0) + 1);

                // If more than 2 distinct characters, shrink window from the left
                while (charCount.size() > 2) {
                    char leftChar = s.charAt(left);
                    charCount.put(leftChar, charCount.get(leftChar) - 1);

                    // Remove the character if its count drops to zero
                    if (charCount.get(leftChar) == 0) {
                        charCount.remove(leftChar);
                    }

                    left++; // Move the left pointer forward
                }

                // Update maxLength with the size of the current valid window
                maxLength = Math.max(maxLength, right - left + 1);
            }

            return maxLength;

    }
}
