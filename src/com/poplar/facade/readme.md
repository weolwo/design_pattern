## 外观模式
#### 外观模式基本介绍基本介绍
1. 外观模式(外观),也叫“过程模式:外观模式为子系统中的一组接口提供一个一致的界面,此模式定义了一个高层接口,这个接口使得这一子系统更加容易使用
2. 外观模式通过定义一个一致的接口,用以屏避内部子系统的细节,使得调用端只需跟这个接口发生调用。而无需关心这个子系统的内部细节
#### 外观模式的原理图:
![原理图](https://img-blog.csdnimg.cn/20190913170241470.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2x1bzYwOTYzMDE5OQ==,size_16,color_FFFFFF,t_70)
#### 外观模式的注意事项及细节
1. 外观模式对外屏蔽了子系统的细节,因此外观模式降低了客户端对子系统使用的复杂性;
2. 外观模式对客户端与子系统的耦合关系,解耦,让子系统内部的模块更易维护和扩展;
3. 通过合理的使用外观模式,可以帮我们更好的划分访问的层次;
5. 在维护一个遗留的大型系统时,可能这个系统已经变得非常难以维护和扩展,此时可以考虑为新系统开发一外观类,
来提供遗留系统的比较清晰简单的接口,让新系统与消退类交互,提高复用性;
6. 当系统需要进行分层设计时,可以考虑使用Facade模求
7. 不能过多的或者不合理的使用外观模式,使用外观模式好,还是直接调用模块好。要以让系统有层次,利于
护为目的。

#### 外观模式在框架中的应用例子
如:Shiro的核心
![Shiro架构图](https://imgconvert.csdnimg.cn/aHR0cDovL3NoaXJvLmFwYWNoZS5vcmcvYXNzZXRzL2ltYWdlcy9TaGlyb0FyY2hpdGVjdHVyZS5wbmc?x-oss-process=image/format,png)
- 源码:
```java
securityManager接口方法
 Subject createSubject(SubjectContext var1);
子类 DefaultSecurityManager
 public Subject createSubject(SubjectContext subjectContext) {
          SubjectContext context = this.copy(subjectContext);
          context = this.ensureSecurityManager(context);
          context = this.resolveSession(context);
          context = this.resolvePrincipals(context);
          Subject subject = this.doCreateSubject(context);
          this.save(subject);
          return subject;
      }
```
以及Mybatis中的`Configuration` 的 `newMetaObject()`方法
```java
  public MetaObject newMetaObject(Object object) {
        return MetaObject.forObject(object, this.objectFactory, this.objectWrapperFactory, this.reflectorFactory);
    }
最终得到 MetaObject
  public static MetaObject forObject(Object object, ObjectFactory objectFactory, ObjectWrapperFactory objectWrapperFactory, ReflectorFactory reflectorFactory) {
    if (object == null) {
      return SystemMetaObject.NULL_META_OBJECT;
    } else {
      return new MetaObject(object, objectFactory, objectWrapperFactory, reflectorFactory);
    }
  }
```