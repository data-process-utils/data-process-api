package com.github.dataprocessutils.dataprocessapi.fileprocess.search.engine.operators;

import static com.github.dataprocessutils.dataprocessapi.utils.Objects.isString;
import static com.github.dataprocessutils.dataprocessapi.utils.Strings.isBoolean;

/**
 * Represents an operator for checking equality between two values.
 */
public class EqualOperator extends AbstractOperator {

    @Override
    public boolean operate(Object targetValue, Object searchValue) {
        if (isNumber(targetValue) && isNumber(searchValue)) {
            Number target = (Number) targetValue;
            Number search = (Number) searchValue;
            return target.equals(search);
        }

        if (isBoolean(targetValue) && isBoolean(searchValue)) {
            Boolean target = (Boolean) targetValue;
            Boolean search = (Boolean) searchValue;
            return target.equals(search);
        }

        if (isString(targetValue) && isString(searchValue)) {
            String target = (String) targetValue;
            String search = (String) searchValue;
            return target.equals(search);
        }

        return String.valueOf(targetValue).equals(String.valueOf(searchValue));
    }
}
