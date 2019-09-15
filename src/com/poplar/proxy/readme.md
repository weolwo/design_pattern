## 代理模式
#### 供代理模式的基本介绍
1. 代理模式:为一个对象提供一个替身,以控制对这个对象的访间,即通过代理对象访问目标对象,
这样做的好处是可以在目标对象实现的基础上增强额外的功能操作,即扩展目标对象的功能;
2. 代理模式有不同的形式,主要有三种静态代理,动态代理(IDK代理,接口代理)和Cglib代理(可以在内存动态的创建对象,而不需要实现接口,
他是属于动态代理的范畴);
3. 被代理的对象可以是远程对象,创速开销大的对象或需要安全控制的对象;
- 代理模式示意图
![代理模式示意图](https://img-blog.csdnimg.cn/20190914175005353.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2x1bzYwOTYzMDE5OQ==,size_16,color_FFFFFF,t_70)

### 静态代理
- 静态代理在使用时,需要定义接口或者父类,被代理对象和代理对象需要继承或实现相同的父类或接口;(知道原理就行,一般不会使用)
### 动态代理(基于JDK)
1. 代理对象不需要实现接口,但目标对象需要实现接口,否则无法实现动态代理;
2. 代理对象的生成是利用JDK的API动态的在内存中构建代理对象;
3. 动态代理也叫JDK代理或者接口代理。
- 案列中我们将使用演员和经纪公司的关系来说明和编码。

### 基于CGLIB的动态代理
 - Cglib代理模式的基本介绍
1. 静态代理和JDK代理模式都要求目标对象是实现一个接口,但是有时候目标对象只是一个单独的对象,并没有实现任何的接口,
这个时候可使用目标对象子类来实现代理这就是Cglib代理;
2. Cglib代理也叫作子类代理,它是在内存中构建一个子类对象从而实现对目标对象功能扩展,有些书也将Cglib代理归属到动态代理;
3. Cglib是一个强大的高性能的代码生成包,它可以在运行期扩展java类与实现java接口它广泛的被许多AOP的框架使用,例如Spring AOP,实现方法拦载;
4. 在AOP编程中如何选择代理模式:
- 目标对象需要实现接口,用JDK代理
- 目标对象不需要实现接口,用Cglib代理
5. Cglib包的底层是通过使用字节码处理框架ASM来转换字节码并生成新的类;

### Cglib代理注意事项
- 需要引入cglib的jar
```java
asm-7.1.jar
cglib-3.2.12.jar
```
- 被代理的类不能为final类
- 如果被代理类的方法是final 或者 static修饰将不会被拦截

#### 使用动态代理实现jdbc连接池案列详见以下几个文件
 ```java
DataSourceTest
CustomDataSource
JDBCUtil
db.properties
```