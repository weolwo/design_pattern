package com.poplar.proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created By poplar on 2019/9/14
 * 测试类
 */
public class Client {


    public static void main(String[] args) {
        Actor actor = new Actor();
        /**
         * ClassLoader loader
         * Class<?>[] interfaces
         * InvocationHandler h
         * 这几个参数都是固定的写法
         */
        //基于接口的JDK代理
        BrokerageFirm proxyInstance = (BrokerageFirm) Proxy.newProxyInstance(actor.getClass().getClassLoader(), actor.getClass().getInterfaces(), new InvocationHandlerImpl(actor));
        proxyInstance.ordinaryActor(20000D);
        proxyInstance.highLevel(100000D);

        System.out.println("***********cglib代理*****************************");
        //基于子类的cglib代理
        Actor2 actor2 = new Actor2();
        /**
         * Class type 类的type
         * Callback callback 需要我们自己写代码的地方
         */
        Actor2 actorProxy = (Actor2) Enhancer.create(actor2.getClass(), new CGlibProxy(actor2));
        actorProxy.ordinaryActor(20000D);
        actorProxy.highLevel(100000D);

    }
}
