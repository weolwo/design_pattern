package com.poplar.strategy.lamdba;

/**
 * Created BY poplar ON 2019/12/28
 * Lambda表达式避免了采用策略设计模式时僵化的模板代码
 */
public class Test {

    public static void main(String[] args) {
        //数字校验器
        Validator numberValidator = new Validator(s -> s.matches("\\d+"));
        //小写字母校验器
        Validator lowerCaseValidator = new Validator(s -> s.matches("[a-z]+"));

        System.out.println(numberValidator.validate("12345"));//true
        System.out.println(lowerCaseValidator.validate("Hello"));//false
    }
}
