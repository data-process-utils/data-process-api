package com.github.dataprocessutils.dataprocessapi.fileprocess.search.engine;

import com.github.dataprocessutils.dataprocessapi.fileprocess.search.Operator;
import com.github.dataprocessutils.dataprocessapi.fileprocess.search.engine.operators.EqualOperator;
import com.github.dataprocessutils.dataprocessapi.fileprocess.search.engine.operators.LogicOperator;

import java.util.HashMap;
import java.util.Map;

public class ObjectSearch {

    private final Map<Operator, LogicOperator> OPERATOR_MAP = new HashMap<>();

    private static final ObjectSearch instance = new ObjectSearch();

    private ObjectSearch() {
        registerOperators();
    }

    private void registerOperators() {
        addOperator(Operator.EQUAL, new EqualOperator());
    }


    public ObjectSearch getInstance() {
        return instance;
    }

    public void addOperator(Operator operator, LogicOperator logicOperator) {
        OPERATOR_MAP.put(operator, logicOperator);
    }

    public LogicOperator getOperator(Operator operator) {
        return OPERATOR_MAP.get(operator);
    }


}
