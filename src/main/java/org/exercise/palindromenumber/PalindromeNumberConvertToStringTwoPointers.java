package org.exercise.palindromenumber;

import java.util.logging.Level;
import java.util.logging.Logger;

public class PalindromeNumberConvertToStringTwoPointers {

    Logger logger = Logger.getLogger(getClass().getName());

    public void checkNumber() {
        int number = 353;
        boolean isPalindromeNumber = isPalindrome(number);
        if (isPalindromeNumber) {
            logger.log(Level.INFO, () -> number + " is a palindrome number");
        } else {
            logger.log(Level.INFO, () -> number + " is not a palindrome number");
        }
    }

    private boolean isPalindrome(int number) {
        String reverseNumber = String.valueOf(number);
        int i = 0;
        int j = reverseNumber.length() - 1;

        while (i < j) {
            if (reverseNumber.charAt(i) != reverseNumber.charAt(j)) {
                return Boolean.FALSE;
            }
            i++;
            j--;
        }
        return Boolean.TRUE;
    }
}
