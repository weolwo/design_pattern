package com.poplar.iterator;

/**
 * Created By poplar on 2019/9/16
 * 自定义实现一个List的添加功能
 */
public class ArrayList extends Collection {
    Object[] objects = new Object[10];

    int index = 0;
    int currentIndex = 0;

    /*添加元素的方法*/
    public void add(Object object) {

        if (index == objects.length) {
            //扩容
            Object[] newObject = new Object[objects.length + 15];
            System.arraycopy(objects, 0, newObject, 0, objects.length);
            objects = newObject;
        }
        objects[index] = object;
        index++;
    }

    //获取数组的长度
    public int getSize() {
        return index;
    }


    @Override
    public boolean hasNext() {
        if (currentIndex < index) {
            return true;
        } else {
            return false;
        }
    }


    @Override
    public Object next() {
        return objects[currentIndex++];
    }
}
