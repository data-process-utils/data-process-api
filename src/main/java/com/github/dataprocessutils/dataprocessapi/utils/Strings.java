package com.github.dataprocessutils.dataprocessapi.utils;

import org.apache.commons.lang3.BooleanUtils;

/**
 * Utility class for handling String operations.
 * Provides methods to check if a String is empty or not.
 *
 * @author João Henrique
 */
public class Strings {

    /**
     * Checks if a given String is empty.
     *
     * @param str the String to be checked
     * @return true if the String is null or empty after removing leading and trailing whitespace, false otherwise
     */
    public static boolean isEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }

    /**
     * Checks if a given String is not empty.
     *
     * @param str the String to be checked
     * @return true if the String is not null and contains at least one non-whitespace character after removing leading and trailing whitespace, false otherwise
     */
    public static boolean isNotEmpty(String str) {
        return !isEmpty(str);
    }

    /**
     * Checks if the given String represents a boolean value.
     *
     * @param str the String to be checked
     * @return true if the String can be converted to a boolean value, false otherwise
     */
    public static boolean isBoolean(String str) {
        return BooleanUtils.toBooleanObject(str) != null;
    }

    /**
     * Checks if the given object can be converted to a boolean value.
     *
     * @param obj the object to be checked
     * @return true if the object can be converted to a boolean value, false otherwise
     */
    public static boolean isBoolean(Object obj) {
        return isBoolean(obj.toString());
    }

}
