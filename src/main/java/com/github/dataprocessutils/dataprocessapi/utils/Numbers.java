package com.github.dataprocessutils.dataprocessapi.utils;

import org.apache.commons.lang3.math.NumberUtils;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * A utility class for common number operations such as rounding, power calculations, and comparisons.
 *
 * @author João Henrique
 */
public class Numbers {

    /**
     * Rounds a double value to a specified number of decimal places using the half-even rounding mode.
     *
     * @param value  the value to be rounded
     * @param places the number of decimal places to round to
     * @return the rounded value
     */
    public static double round(double value, int places) {
        return BigDecimal.valueOf(value).setScale(places, RoundingMode.HALF_EVEN).doubleValue();
    }

    /**
     * Rounds an integer value to a specified number of decimal places.
     *
     * @param value  the integer value to be rounded
     * @param places the number of decimal places to round to
     * @return the rounded integer value
     */
    public static int round(int value, int places) {
        return (int) (Math.round(value / Math.pow(10, places)) * Math.pow(10, places));
    }

    /**
     * Rounds a long value to a specified number of decimal places.
     *
     * @param value  the long value to be rounded
     * @param places the number of decimal places to round to
     * @return the rounded long value
     */
    public static long round(long value, int places) {
        return (long) (Math.round(value / Math.pow(10, places)) * Math.pow(10, places));
    }


    /**
     * Check if two numbers are equal, implemented by using the equals method of the first number.
     *
     * @param n1 the first number to compare
     * @param n2 the second number to compare
     * @return {@code true} if the numbers are equal, {@code false} otherwise
     */
    public static boolean isEqual(Number n1, Number n2) {
        return n1.equals(n2);
    }

    /**
     * Checks if the input string is numeric.
     *
     * @param str the string to be checked
     * @return {@code true} if the string is numeric, {@code false} otherwise
     */
    public static boolean isNumeric(String str) {
        return NumberUtils.isCreatable(str);
    }

    public static boolean isNumeric(Object obj) {
        return isNumeric(obj.toString());
    }

    public static Number toNumber(String str) {
        return NumberUtils.createNumber(str);
    }


    /**
     * Check if the first number is equal to the second number represented as a string.
     *
     * @param n1 the first number to compare
     * @param n2 the second number represented as a string to compare
     * @return true if the first number is equal to the second number after conversion, false otherwise
     */
    public boolean isEqual(Number n1, String n2) {
        if (isNumeric(n2)) {
            return n1.equals(toNumber(n2));
        }
        return false;
    }

    /**
     * Checks if the first number represented as a string is equal to the second number.
     *
     * @param n1 the string representation of the first number
     * @param n2 the second number to compare
     * @return true if the first number is equal to the second number after conversion, false otherwise
     */
    public boolean isEqual(String n1, Number n2) {
        if (isNumeric(n1)) {
            return toNumber(n1).equals(n2);
        }
        return false;
    }

    /**
     * Check if two strings are equal after converting them to numbers.
     *
     * @param num1 the first string representing a number
     * @param num2 the second string representing a number
     * @return true if the strings are equal as numbers, false otherwise
     */
    public boolean isEqual(String num1, String num2) {
        if (isNumeric(num1) && isNumeric(num2)) {
            return toNumber(num1).equals(toNumber(num2));
        }
        return false;
    }

    /**
     * Checks if the input string represents a decimal value.
     *
     * @param str the input string to be checked
     * @return true if the string represents a decimal value, false otherwise
     */
    public static boolean isDecimal(String str) {
        if (isNumeric(str)) {
            return NumberUtils.createBigDecimal(str).scale() > 0;
        }
        return false;
    }


    /**
     * Converts the input string to a BigDecimal with default scale 2 using the HALF_EVEN rounding mode.
     *
     * @param str the string to convert to BigDecimal
     * @return the converted BigDecimal value
     */
    public static BigDecimal toBigDecimal(String str) {
        return toBigDecimal(str, 2);
    }


    /**
     * Converts the input string to a BigDecimal with a specified scale using the HALF_EVEN rounding mode.
     *
     * @param str   the string to convert to BigDecimal
     * @param scale the scale of the resulting BigDecimal
     * @return the converted BigDecimal value
     */
    public static BigDecimal toBigDecimal(String str, int scale) {
        return new BigDecimal(str).setScale(scale, RoundingMode.HALF_EVEN);
    }


}
