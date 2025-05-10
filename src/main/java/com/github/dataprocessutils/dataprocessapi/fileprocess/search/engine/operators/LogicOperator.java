package com.github.dataprocessutils.dataprocessapi.fileprocess.search.engine.operators;

/**
 * Interface representing a logic operator for comparing two values.
 *
 * @author João Henrique
 */
public interface LogicOperator {

    /**
     * Performs comparison between two values.
     *
     * @param targetValue the value to be compared against searchValue
     * @param searchValue the value to search for equality with targetValue
     * @return true if targetValue is equal to searchValue, false otherwise
     */
    boolean operate(Object targetValue, Object searchValue);
}
