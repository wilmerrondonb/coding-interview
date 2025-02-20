package org.exercise;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Factorial {

    Logger logger = Logger.getLogger(getClass().getName());

    protected void calculateFactorial() {
        int factorialNumber = 5;
        int factorialResult = getFactorial(factorialNumber);
        logger.log(Level.INFO, () -> factorialNumber + "! = " + factorialResult);
    }

    private int getFactorial(int factorialNumber) {
        if (factorialNumber == 0 || factorialNumber == 1) {
            return 1;
        }

        int factorialResult = factorialNumber;
        for (int i = factorialNumber - 1; i >= 1; i--) {
            factorialResult = factorialResult * i;
        }
        return factorialResult;
    }
}
