package org.exercise.palindromenumber;

import java.util.logging.Level;
import java.util.logging.Logger;

public class PalindromeNumberIterative {

    Logger logger = Logger.getLogger(getClass().getName());

    public void checkNumber() {
        int number = 3553;
        boolean isPalindromeNumber = isPalindrome(number);

        if (isPalindromeNumber) {
            logger.log(Level.INFO, () -> number + " is a palindrome number");
        } else {
            logger.log(Level.INFO, () -> number + " is not a palindrome number");
        }
    }

    private boolean isPalindrome(int number) {
        int reverseNumber = 0;
        int iterativeNumber = number;
        while (iterativeNumber > 0) {
            reverseNumber = (reverseNumber * 10) + (iterativeNumber % 10);
            iterativeNumber = iterativeNumber / 10;
        }
        return number == reverseNumber;
    }
}
