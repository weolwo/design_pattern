### 建造者模式基本介绍
1. 建造者模式是一种对象构建模式,它可以将复杂对象的建造过程抽象出来(抽象类别),使这个抽象过程的不同实现方法可以构造出不同表现(属性)的对象。
2. 建造者模式是一步一步创建一个复杂的对象,它允许用户只通过指定复杂对象的类型和内容就可以构建它们,用户不需要知道内部的具体构建细节
### 建造者模式的四个角色
1. Product(产品角色):一个具体的产品对象
2. Builder(抽象建造者):创建一个产品对象的各个部件指定的接口/抽象类
3. ConcreteBuilder(具体体建造者):实现接口,构建和装配各个部件。
4. Director(指挥者):构建一个使用Buidr接口的对象。它主要是用于创建一个复杂的对象。它主要有两个作用,一是:隔离了客户与对象的生产过程,二是:负责控制产品对象的生产过程

### 原理类图:
![原理类图](https://img-blog.csdnimg.cn/20190913104647123.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2x1bzYwOTYzMDE5OQ==,size_16,color_FFFFFF,t_70)

#### 在JDK中的应用
----
![uml图](https://img-blog.csdnimg.cn/20190913142006746.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2x1bzYwOTYzMDE5OQ==,size_16,color_FFFFFF,t_70)
- 代码:
```java
StringBuilder里面的append()方法
@Override
public StringBuilder append(char c) {
super.append(c);
return this;
}

其父类的append()方法

  @Override
public AbstractStringBuilder append(char c) {
    ensureCapacityInternal(count + 1);
    value[count++] = c;
    return this;
}

测试代码
StringBuilder builder =new StringBuilder();
StringBuilder stringBuilder = builder.append("猫").append("花").append("美美的");
```
- 建造者最常用的其实是链式调用，因为我可以订做这个产品的具体细节，你再给我多少个append()或者一些其他方法调用，我返回的还是StringBuilder这个对象，也就是这个产品不变，但是里面的细节我有要求你给我做成什么样的。