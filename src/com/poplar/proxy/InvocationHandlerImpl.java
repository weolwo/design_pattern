package com.poplar.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created By poplar on 2019/9/14
 */
public class InvocationHandlerImpl implements InvocationHandler {

    Actor actor = null;

    public InvocationHandlerImpl(Actor actor) {
        this.actor = actor;
    }

    /**
     * 执行被代理对象的任何方法都会经过该方法，该方法有拦截的作用
     *
     * @param proxy  代理对象的引用，不一定每次都会用
     * @param method 当前执行的方法
     * @param args   当前执行方法需要的参数
     * @return 当前执行方法的返回值
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;
        //1.取出执行方法中的参数
        Double money = (Double) args[0];
        //2.判断当前执行的方法
        if ("ordinaryActor".equals(method.getName())) {
            if (money > 10000) {
                result = method.invoke(actor, money / 2);//经纪公司费用
            }
        }
        if ("highLevel".equals(method.getName())) {
            if (money > 50000) {
                result = method.invoke(actor, money / 2);
            }
        }

        return result;
    }
}
