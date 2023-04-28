package com.fesenkodenis;

import java.math.BigDecimal;
import java.math.MathContext;

/**
 * The PiCalculation class provides a method to calculate the value of Pi
 * up to a specified precision using a BigDecimal implementation.
 */
public class PiCalculation {

    /**
     * The main method used to demonstrate the Pi calculation.
     *
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        System.out.println(calculatePi(20));
    }

    /**
     * Calculates the value of Pi up to the given precision using the
     * Bailey-Borwein-Plouffe (BBP) formula.
     *
     * @param precision the number of decimal places to calculate Pi
     * @return a BigDecimal representing the value of Pi up to the specified precision
     */
    public static BigDecimal calculatePi(int precision) {
        MathContext mc = new MathContext(precision + 2); // Extra 2 digits for rounding
        BigDecimal pi = BigDecimal.ZERO;
        BigDecimal sixteen = new BigDecimal(16);

        for (int k = 0; k <= precision + 2; k++) {
            BigDecimal a = BigDecimal.ONE.divide(sixteen.pow(k), mc);
            BigDecimal b = new BigDecimal(4).divide(new BigDecimal(8 * k + 1), mc);
            BigDecimal c = new BigDecimal(2).divide(new BigDecimal(8 * k + 4), mc);
            BigDecimal d = new BigDecimal(1).divide(new BigDecimal(8 * k + 5), mc);
            BigDecimal e = new BigDecimal(1).divide(new BigDecimal(8 * k + 6), mc);
            pi = pi.add(a.multiply(b.subtract(c).subtract(d).subtract(e), mc));
        }

        return pi.round(new MathContext(precision + 1)); // Round to the desired precision
    }
}
