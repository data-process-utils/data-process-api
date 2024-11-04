package com.github.dataprocessutils.dataprocessapi.utils;

public class Objects {

    public static boolean isNull(Object obj) {
        return obj == null;
    }

    public  static boolean isNotNull(Object obj) {
        return obj != null;
    }


    public static boolean isEquals(Object obj1, Object obj2) {
        if (obj1 == null && obj2 == null) {
            return false;
        }

//        if(obj1.getClass() != obj2.getClass()) {
//
//
//
//
//        }

        return obj1.equals(obj2);


    }

    /**
     * Checks if the input value is an instance of a String.
     *
     * @param value the value to be checked
     * @return true if the value is a String, false otherwise
     */
    public static boolean isString(Object value) {
        return value instanceof String;
    }

    /**
     * Checks if two objects are not equal.
     *
     * @param obj1 the first object to compare
     * @param obj2 the second object to compare
     * @return true if the objects are not equal, false otherwise
     */
    public static boolean isNotEquals(Object obj1, Object obj2) {
        return !isEquals(obj1, obj2);
    }




}
