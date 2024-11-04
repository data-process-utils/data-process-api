package com.github.dataprocessutils.dataprocessapi.fileprocess.search;

/**
 * SearchParams class represents search parameters containing a field, operator, and value for comparison.
 * The field specifies the field name for comparison, the operator specifies the type of comparison to perform,
 * and the value is the value to compare against.
 *
 * @author João Henrique
 */
public class SearchParams {

    /**
     * This private String field represents a field name for comparison in search parameters.
     */
    private String field;

    /**
     * Represents the type of comparison operator for search parameters.
     */
    private Operator operator;

    /**
     * This private Object value represents the value to compare against in search parameters.
     */
    private Object value;


    /**
     * Returns the field name for comparison in search parameters.
     *
     * @return The field name for comparison in search parameters.
     */
    public String getField() {
        return field;
    }

    /**
     * Sets the field name for comparison in search parameters.
     *
     * @param field The field name for comparison in search parameters to be set.
     */
    public void setField(String field) {
        this.field = field;
    }

    /**
     * Retrieves the comparison operator for search parameters.
     *
     * @return The comparison operator for search parameters.
     */
    public Operator getOperator() {
        return operator;
    }

    /**
     * Sets the comparison operator for search parameters.
     *
     * @param operator The comparison operator to be set for search parameters.
     */
    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    /**
     * Retrieves the value to compare against in search parameters.
     *
     * @return The value to compare against in search parameters.
     */
    public Object getValue() {
        return value;
    }

    /**
     * Sets the value for the search parameter.
     *
     * @param value The value to be set for the search parameter.
     */
    public void setValue(Object value) {
        this.value = value;
    }
}
