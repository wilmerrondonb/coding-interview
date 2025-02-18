package org.exercise;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AnagramString {

    Logger logger = Logger.getLogger(getClass().getName());

    protected void checkString() {
        String firstString = "heart";
        String secondString = "earth";
        boolean isAnagram;

        isAnagram = isAnagramString(firstString, secondString);

        if (isAnagram) {
            logger.log(Level.INFO, () -> "Strings are Anagram");
        }else {
            logger.log(Level.INFO, () -> "Strings are not Anagram");
        }
    }

    private boolean isAnagramString(String firstString, String secondString) {
        char[] firstArrayChar = firstString.toLowerCase().toCharArray();
        char[] secondArrayChar = secondString.toLowerCase().toCharArray();

        Arrays.sort(firstArrayChar);
        Arrays.sort(secondArrayChar);

        return Arrays.equals(firstArrayChar, secondArrayChar);
    }
}
