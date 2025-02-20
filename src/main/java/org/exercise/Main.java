package org.exercise;

import org.exercise.palindromeword.PalindromeWordTwoPointers;

public class Main {

    public static void main(String[] args) {
        // Palindrome Words
        PalindromeWordTwoPointers palindromeWordTwoPointers = new PalindromeWordTwoPointers();
        palindromeWordTwoPointers.checkWord();

        // Anagram Strings
        AnagramString anagramString = new AnagramString();
        anagramString.checkString();

        // Fibonacci Sequence
        FibonacciDynamicProgramming fibonacciDynamicProgramming = new FibonacciDynamicProgramming();
        fibonacciDynamicProgramming.calculateFibonacci();

        // Factorial
        Factorial factorial = new Factorial();
        factorial.calculateFactorial();
    }
}
