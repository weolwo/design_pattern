## 装饰者模式

-  需求:咖啡馆订单项目.
----
1. 咖啡种类:单品咖啡, Espresso Coffee(意大利浓咖啡),LongCoffee(美式咖啡),Decaf(无因咖啡)

2. 调料种类:Milk(牛奶),chocolate(巧克力),Soy(豆浆)

3.  要求再扩展新的咖啡种类时,要有良好的扩展性,方便维护

4.  使用OO来计算不同咖啡的价格,用户可以点单品咖啡,或者添加调料
---
#### 装饰者模式的定义:

动态的将新功能附加到对象上,他在功能扩展方面,比继承有更好的扩展性,符合编码的开闭原则


#### 装饰者模式的原理:

就像我们制作一束鲜花一样,我们会根据用户的需求使用不同的包装纸去装饰鲜花
1. 鲜切花(被装饰着)
2. 各种包装纸(装饰者)
 
#### 装饰者模式在JDK中的具体应用
![类图](https://img-blog.csdnimg.cn/20190913134224832.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2x1bzYwOTYzMDE5OQ==,size_16,color_FFFFFF,t_70)