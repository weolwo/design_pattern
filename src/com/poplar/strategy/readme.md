## 策略模式
#### 策略模式的基本介绍
- 策略模式(Strategy Pattern)中,定义算法组(策略),把他们分别封装起来,让他们之间可以互相替换,此模式让使用算法的
变化独立于使用算法的客户.
- 此模式体现了一下几个设计原则,第一,把变化的代码从不变的代码中分离初出来;第二,针对接口编程而不针对具体;
第三,多用组合\聚合,少用继承;
#### 原理图:
[原理图](https://img-blog.csdnimg.cn/20190913104351414.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2x1bzYwOTYzMDE5OQ==,size_16,color_FFFFFF,t_70)
#### 策略模式的注意事项和细节
1. 策略模式的关键是:分析项目中变化部分与不变部分
2. 策略模式的核心思想的是:多用组合/聚合少用继承;用行为类组合,而不是行为的继承。更有弹性
3. 体现了“对修改关闭,对扩展开放“原则,客户端增加行为不用修改原有代码,只要添加一种策略(或者行为)即可,避免了使用多重转移语句(如果。其他if else)
4. 提供了可以替换继承关系的办法:策略模式将算法封装在独立的Strategy类中使得你可以独立于其上下文改变它,使它易于切换,易于理解,易于扩展
5. 需要注意的是:每添加一个策略就要增加一个类,当策略过多是会导致类数目庞

#### JDK中使用策略模式的类还是比较多的
比如Arrays.sort(Comparator comparator);
```java
 public static <T> void sort(T[] a, Comparator<? super T> c) {
        if (c == null) {
            sort(a); //默认的策略
        } else {
            if (LegacyMergeSort.userRequested)
                legacyMergeSort(a, c); //你传入的策略
            else
                TimSort.sort(a, 0, a.length, c, null, 0, 0);
        }
    }
```