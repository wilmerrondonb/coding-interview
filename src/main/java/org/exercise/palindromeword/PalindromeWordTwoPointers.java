package org.exercise.palindromeword;

import java.util.logging.Level;
import java.util.logging.Logger;

public class PalindromeWordTwoPointers {

    Logger logger = Logger.getLogger(getClass().getName());

    public void checkPalindromeWord() {
        String word = "rotator";
        boolean isPalindromeWord = isPalindrome(word);

        if (isPalindromeWord) {
            logger.log(Level.INFO, () -> word + " is a palindrome word");
        } else {
            logger.log(Level.INFO, () -> word + " is not a palindrome word");
        }
    }

    private boolean isPalindrome(String word) {
        boolean isPalindromeWord = true;
        int i = 0;
        int j = word.length() - 1;

        while (i < j) {
            if (word.charAt(i) != word.charAt(j)) {
                isPalindromeWord = false;
                break;
            }
            i++;
            j--;
        }
        return isPalindromeWord;
    }
}