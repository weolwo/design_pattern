## 迭代器模式
- 提供一种方法顺序访问一个聚合对象中的各个元素，而又不暴露其内部的表示
- 虽然这种模式使用率很高,但是几乎很少需要程序员自己去写,因为他主要针对的是容器类对象,而`java`对于各种容器几乎都提供了
自带的迭代器,我们直接用就行,如:`List,LinkedList等类`

#### 原理类图
![ 原理类图](https://img-blog.csdnimg.cn/20190916203559155.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2x1bzYwOTYzMDE5OQ==,size_16,color_FFFFFF,t_70)
#### 案列
- 案列我们采用了仿照JDK实现`ArrayList`和`LinkedList`的迭代,由于这两种容器存储原理是不一样的,所以比较好作说明
![UML类图](https://img-blog.csdnimg.cn/20190917152857639.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2x1bzYwOTYzMDE5OQ==,size_16,color_FFFFFF,t_70)
- 该案列我没有按照标准的架构去实现案列,主要是没有什么意义,这个设计模式最重要的是学习其思想;
- 案列中不管是什么聚合类,作为使用者都只需要用同一个方法去迭代即可,他们每个聚合类具体怎么实现的我们不去管
- 案列中使用的`ArrayList` `LinkedList` 里面的方法我写的很粗糙,希望大家不要介意,主要是为了表达思想,牛逼的大神不妨自己写个牛逼的,到时供大家学习下.