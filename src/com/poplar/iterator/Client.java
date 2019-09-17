package com.poplar.iterator;

/**
 * Created By poplar on 2019/9/17
 */
public class Client {

    //测试
    public static void main(String[] args) {
        Collection list = new LinkedList();//ArrayList();
        for (int i = 0; i < 10; i++) {
            list.add(new Cat(i));
        }
        System.out.println(list.getSize());

        while (list.hasNext()) {
            System.out.println(list.next());
        }
    }

}
