package org.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FibonacciDynamicProgramming {

    Logger logger = Logger.getLogger(getClass().getName());

    protected void calculateFibonacci() {
        int limitNumber = 10;
        List<Integer> fibonacciSeries = getFibonacciSeries(limitNumber);

        for (Integer fibonacciNumber : fibonacciSeries) {
            logger.log(Level.INFO, fibonacciNumber::toString);
        }
    }

    private List<Integer> getFibonacciSeries(int limitNumber) {
        List<Integer> fibonacciSeries = new ArrayList<>();
        // Initial conditions
        fibonacciSeries.add(0);
        fibonacciSeries.add(1);

        int newFibonacciNumber;
        int sequenceIndex = fibonacciSeries.size();
        for (int i = 2; i <= limitNumber; i++) {
            int penultimateNumber = fibonacciSeries.get(sequenceIndex - 2);
            int lastNumber = fibonacciSeries.get(sequenceIndex - 1);

            newFibonacciNumber = penultimateNumber + lastNumber;
            fibonacciSeries.add(newFibonacciNumber);

            sequenceIndex++;
        }
        return fibonacciSeries;
    }
}
