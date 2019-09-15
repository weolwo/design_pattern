## 桥接模式
#### 桥接模式的介绍
1. 将实现与抽象放在两个不同类层次中,使得两个层次可以独立改变;
2. 是一种结构型设计模式;
3. 基于类的最小设计原则,通过,封装,聚合,继承等行为让不同的类承担不同的职责,他们的主要特点是把抽象与具体
实现分离开来,从而保持各部分的独立性以及他们的功能扩展。
#### 桥接模式的原理图
![桥接模式原理图](https://img-blog.csdnimg.cn/2019091510122177.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2x1bzYwOTYzMDE5OQ==,size_16,color_FFFFFF,t_70)
#### 桥接模式的注意事项和细节
1. 实现了抽象和实现部分的分离,从而极大的提高了系统的灵活性,让抽象部分和实现部分独立开来,这有助于系统进行分层设计,从而产生更好的结构化系统;
2. 对于系统的高层部分,只需要知道抽象部分和实现部分的接口就可以了,其它的部分由具体业务来完成;
3. 桥接模式替代多层维承方案,可以减少子类的个数,降低系统的管理和维护成本;
4. 桥接模式的引入增加了系统的理解和设计难度,由于聚合关联关系建立在抽象层,要求开发者针对抽象进行设计和继程;
5. 桥接模式要求正确识别出系统中两个独立变化的维度(插象,和实现),因此其使用范围有一定的局限性,即种要有这样的应用场景。
#### 桥接模式其它应用场景
- 对子那些不希望使用维承或因为多层次继承导教系統类的个數急刷增加的系統,桥接模式尤为适用

#### 在JDK中的应用
- `java.util.logging`是JDK自带的日志包，可以将日志输出到文件、内存或者控制台，作用与我们常用的log4j类似。
包中的`Handler`类和`Formatter`类在设计上利用了桥接模式
![UML类图](https://img-blog.csdnimg.cn/20190915103446949.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2x1bzYwOTYzMDE5OQ==,size_16,color_FFFFFF,t_70)