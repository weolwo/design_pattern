package com.poplar.strategy.lamdba;

/**
 * Created BY poplar ON 2019/12/28
 */
public class Validator {
    private ValidationStrategy strategy;

    public Validator(ValidationStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean validate(String s) {
        return strategy.execute(s);
    }

}
