package org.exercise;

import org.exercise.palindromenumber.PalindromeNumberConvertToStringTwoPointers;
import org.exercise.palindromenumber.PalindromeNumberIterative;
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
        FactorialIterativeLoop factorialIterativeLoop = new FactorialIterativeLoop();
        factorialIterativeLoop.calculateFactorial();

        // Palindrome Number: Convert number to String and implemented Two Pointers approach
        PalindromeNumberConvertToStringTwoPointers palindromeNumberConvertToStringTwoPointers = new PalindromeNumberConvertToStringTwoPointers();
        palindromeNumberConvertToStringTwoPointers.checkNumber();

        // Palindrome Number Iterative approach
        PalindromeNumberIterative palindromeNumberIterative = new PalindromeNumberIterative();
        palindromeNumberIterative.checkNumber();
    }
}
