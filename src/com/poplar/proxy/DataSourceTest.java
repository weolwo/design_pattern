package com.poplar.proxy;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created By poplar on 2019/9/14
 */
public class DataSourceTest {
    public static void main(String[] args) throws Exception {
        int size = CustomDataSource.getPoolSize();
        System.out.println("使用连接之前 " + size);

        for (int i = 0; i < 10; i++) {
            Connection conn = CustomDataSource.getConnection();
            System.out.println(conn);
            conn.close();//此时不能关闭，必须把连接放回池里
        }

        int size1 = CustomDataSource.getPoolSize();
        System.out.println("使用连接之后 " + size1);

        for (int i = 0; i < 10; i++) {
            Connection conn = CustomDataSource.getConnection();
            System.out.println(conn);
            conn.close();//此时不能关闭，必须把连接放回池里
        }

    }
}
