
## 状态模式
#### 基本介绍

- 他主要是解决对象在多种状态下转换时,需要对外输出不同行为的问题,状态和行为是一一对应的,状态之间可以相互转换
- 当一个对象的内在状态改变时,允许其行为改变,这个对象看起来像是改变了其类.

#### 状态模式的原理图
![状态模式的原理图](https://img-blog.csdnimg.cn/20190917201004568.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2x1bzYwOTYzMDE5OQ==,size_16,color_FFFFFF,t_70)
#### 状态模式的注意事项和细节
1. 代码有很强的可读性,状态模式将每个状态的行为封装到对应的一个类中;
2. 方便维护。将容易产生问题的`if else`语句删除了,如果把每个状态的行为都放到一个类中,每次调用方法时都要判断当前是什么状态,不但会产出很多`if else`语句,而且容易出的错;
3. 符合“开闭原则”。容易增删状态;
4. 会产生很多类。每个状态都要一个对应的类,当状态过多时会产生很多类,加大维护准度;
5. 应用场景:当一个事件或者对象有很多种状态,状态之间会相互转换,对不同的状态要求有不同的行为的时候可以考虑使用状态模式。

#### 案列
- 以一个现在很流行的app抽奖活动作为背景，
- 应用抽奖活动问题
- 请编写程序完成应用抽奖活动具体要求如下:
1. 假如每参加一次这个活动要扣除用户因此积分,中奖概率是10%;
2. 奖品数量固定,抽完就不能抽奖;
3. 活动有四个状态:可以抽奖,不能抽奖,发放奖品和奖品领完;
4. 活动的四个状态转换关系图(图)

![状态转换关系图](https://img-blog.csdnimg.cn/20190917220525481.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2x1bzYwOTYzMDE5OQ==,size_16,color_FFFFFF,t_70)

- 最终的UML类图：

![UML类图](https://img-blog.csdnimg.cn/20190917201729503.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2x1bzYwOTYzMDE5OQ==,size_16,color_FFFFFF,t_70)