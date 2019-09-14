package com.poplar.proxy;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created By poplar on 2019/9/14
 */
public class CGlibProxy implements MethodInterceptor {
    private Actor2 actor2 = null;

    public CGlibProxy(Actor2 actor2) {
        this.actor2 = actor2;
    }

    /**
     * @param proxy
     * @param method
     * @param args
     * @param methodProxy 当前执行方法的代理对象，一般不用
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        Object result = null;
        //1.取出执行方法中的参数
        Double money = (Double) args[0];
        //2.判断当前执行的方法
        if ("ordinaryActor".equals(method.getName())) {
            if (money > 10000) {
                result = method.invoke(actor2, money / 2);//经纪公司费用
            }
        }
        if ("highLevel".equals(method.getName())) {
            if (money > 50000) {
                result = method.invoke(actor2, money / 2);
            }
        }

        return result;
    }
}
