package com.github.dataprocessutils.dataprocessapi.fileprocess.search.engine.operators;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertTrue;

class EqualOperatorTest {

    private static final Logger LOG = LogManager.getLogger(EqualOperatorTest.class);

    private final EqualOperator equalOperator = new EqualOperator();

    @DisplayName("verify if two numbers is equals (numbers)")
    @Test
    void testNumberEqualsNumbers() {
        LOG.info("Testing if two numbers are equals");
        assertTrue(equalOperator.operate(10, 10));
    }


    @DisplayName("verify if two numbers is equals (decimal)")
    @Test
    void testNumberEqualsDecimal() {
        LOG.info("Testing if two numbers are equals (decimal)");
        assertTrue(equalOperator.operate(10.5, 10.5));
    }


    @DisplayName("verify if two numbers is equals (decimal)")
    @Test
    void testNumberEqualsBigDecimal() {
        LOG.info("Testing if two numbers are equals (BigDecimal)");
        assertTrue(equalOperator.operate(new BigDecimal("10.5"), new BigDecimal("10.5")));
    }

    @DisplayName("verify if two numbers is equals (decimal)")
    @Test
    void testBooleanEqual() {
        LOG.info("Testing if two booleans are equals");
        assertTrue(equalOperator.operate(true, true));
    }

}