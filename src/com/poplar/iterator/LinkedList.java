package com.poplar.iterator;

/**
 * Created By poplar on 2019/9/16
 * 自定义实现LinkedList类
 */
public class LinkedList extends Collection {
    private Node head = null;

    private Node tail = null;

    int size = 0;

    int currentIndex = 0;

    /*添加元素的方法*/
    public void add(Object obj) {
        Node node = new Node(obj, null);
        if (head == null) {
            head = node;
        }
        if (tail == null) {
            tail = node;
        }
        tail.setNext(node);
        tail = node;

        size++;
    }

    public int getSize() {
        return size;
    }

    /*楼主实现的方法比较Low,牛逼的大神可以改造下 ;)*/
    @Override
    public boolean hasNext() {
        if (size == 0 || currentIndex == size || head == null || tail == null) {
            return false;
        } else {
            return true;
        }
    }

    /*楼主实现的方法比较Low,牛逼的大神可以改造下 ;),当然这种效率非常低下*/
    @Override
    public Object next() {

        Node temp = head;
        for (int i = 0; i < currentIndex; i++) {
            temp = temp.getNext();
        }
        currentIndex++;
        return temp.getData();
    }
}
