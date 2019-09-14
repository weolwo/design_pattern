package com.poplar.proxy;

import com.poplar.utils.JDBCUtil;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created By poplar on 2019/9/14
 * 自定义连接池,并使用动态代理增强Connection对象的close()方法
 */
public class CustomDataSource {

    //定义一个池，用于存放连接
    private static List<Connection> pool = Collections.synchronizedList(new ArrayList<Connection>());//把ArrayList转成线程安全的

    //使用静态代码块给池中加入连接
    static {
        for (int i = 0; i < 10; i++) {
            Connection conn = JDBCUtil.getConnection();
            pool.add(conn);
        }
    }

    /**
     * 获取一个连接
     *
     * @return
     */
    public static Connection getConnection() {
        Connection conn = pool.remove(0);
        //创建代理对象
        Connection proxyConn = (Connection) Proxy.newProxyInstance(conn.getClass().getClassLoader(),
                conn.getClass().getInterfaces(),
                (proxy, method, args) -> {
                    Object rtValue = null;
                    //1.判断当前方法是不是close方法
                    if ("close".equals(method.getName())) {
                        //不能直接关闭
                        pool.add(conn);//还回池中
                    } else {
                        rtValue = method.invoke(conn, args);
                    }
                    return rtValue;
                });
        return proxyConn;
    }


    /**
     * 获取池中的连接数
     *
     * @return
     */
    public static int getPoolSize() {
        return pool.size();
    }
}
