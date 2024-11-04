package com.github.dataprocessutils.dataprocessapi.fileprocess.search.engine.operators;

import com.github.dataprocessutils.dataprocessapi.utils.Numbers;

import java.math.BigDecimal;

/**
 * Abstract class representing a logic operator with utility methods for handling
 * different types of values. Implements the LogicOperator interface.
 */
public abstract class AbstractOperator implements LogicOperator {






    protected Number toNumber(String str) {
        return Numbers.toNumber(str);
    }

    protected BigDecimal toBigDecimal(String str) {
        return Numbers.toBigDecimal(str);
    }

    protected BigDecimal toBigDecimal(String str, int scale) {
        return Numbers.toBigDecimal(str, scale);
    }

    protected boolean isNumber(Object obj) {
        return Numbers.isNumeric(obj);
    }

    protected boolean isDecimalValue(Object obj) {
        return isDecimalValue(obj.toString());
    }





}
