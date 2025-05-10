package com.github.dataprocessutils.dataprocessapi.fileprocess.search;

/**
 * Enum representing different comparison operators for search parameters.
 *
 * @author João Henrique
 */
public enum Operator {
    /**
     * Represents the EQUAL comparison operator for search parameters.
     */
    EQUAL,

    /**
     * Represents the LESS_THAN comparison operator for search parameters.
     */
    LESS_THEN,

    /**
     * Represents the DIFFERENT comparison operator for search parameters.
     */
    DIFFERENT,

    /**
     * Represents the GREATER_THAN comparison operator for search parameters.
     */
    GREATER_THAN,

    /**
     * Represents the GREATER_THAN_OR_EQUAL comparison operator for search parameters.
     */
    GREATER_THAN_OR_EQUAL,

    /**
     * Represents the LESS_THAN_OR_EQUAL comparison operator for search parameters.
     */
    LESS_THAN_OR_EQUAL,

    /**
     * Represents the CONTAINS comparison operator for search parameters.
     */
    CONTAINS,

    /**
     * Represents the STARTS_WITH comparison operator for search parameters.
     */
    STARTS_WITH,

    /**
     * Represents the ENDS_WITH comparison operator for search parameters.
     */
    ENDS_WITH
}
