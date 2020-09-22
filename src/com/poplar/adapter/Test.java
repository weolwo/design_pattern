package com.poplar.adapter;

import java.io.*;

/**
 * Create BY poplar ON 2020/9/22
 * 由于这个模式很简单就不做太多叙述
 */
public class Test {


    public static void main(String[] args) {
        //当我们读一个文本文件的时候，我们希望一行一行的读时BufferedReader帮我们适配，InputStreamReader这个类不支持读取一行
        InputStreamReader reader = null;
        InputStream in = null;
        try {
            in = new FileInputStream("d:/test.txt");
            reader = new InputStreamReader(in);
            BufferedReader br = new BufferedReader(reader);
            String tempString = null;
            int line = 1;
            // 一次读入一行，直到读入null为文件结束
            while ((tempString = br.readLine()) != null) {
                // 显示行号
                System.out.println("line " + line + ": " + tempString);
                line++;
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null)
                    reader.close();
                if (in != null)
                    in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
