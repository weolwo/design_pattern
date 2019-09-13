###建造者模式基本介绍
1. 建造者模式是一种对象构建模式,它可以将复杂对象的建造过程抽象出来(抽象类别),使这个抽象过程的不同实现方法可以构造出不同表现(属性)的对象。
2. 建造者模式是一步一步创建一个复杂的对象,它允许用户只通过指定复杂对象的类型和内容就可以构建它们,用户不需要知道内部的具体构建细节
###建造者模式的四个角色
1. Product(产品角色):一个具体的产品对象
2. Builder(抽象建造者):创建一个产品对象的各个部件指定的接口/抽象类
3. ConcreteBuilder(具体体建造者):实现接口,构建和装配各个部件。
4. Director(指挥者):构建一个使用Buidr接口的对象。它主要是用于创建一个复杂的对象。它主要有两个作用,一是:隔离了客户与对象的生产过程,二是:负责控制产品对象的生产过程

###原理类图:
[原理类图](https://img-blog.csdnimg.cn/20190913104647123.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2x1bzYwOTYzMDE5OQ==,size_16,color_FFFFFF,t_70)
####建造者模式在JDK中的具体应用
[类图](https://img-blog.csdnimg.cn/20190913134224832.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2x1bzYwOTYzMDE5OQ==,size_16,color_FFFFFF,t_70)