# Design-Pattern-Learning [![star this repo](http://githubbadges.com/star.svg?user=mynawang&repo=Design-Pattern-Learning&style=flat&color=fff&background=1081C1)](https://github.com/mynawang/Design-Pattern-Learning) [![fork this repo](http://githubbadges.com/fork.svg?user=mynawang&repo=Design-Pattern-Learning&style=flat&color=fff&background=1081C1)](https://github.com/mynawang/Design-Pattern-Learning/fork)

## 简介

###6个创建形式模式
1.简单工厂模式(Simple Factory Pattern)<br>
2.抽象工厂模式(Abstract Factory Pattern)<br>
3.工厂方法模式(Factory Method Pattern)<br>
4.建造者模式(Builder Pattern)<br>
5.单例模式(Singleton Pattern)<br>
6.原型模式(Prototype Pattern)<br>

###7个结构型模式
1.适配器模式(Adapter Pattern)<br>
2.装饰模式(Decorator Pattern)<br>
3.代理模式(Proxy Pattern)<br>
4.桥接模式(Bridge Pattern)<br>
5.外观模式(Facade Pattern)<br>
6.享元模式(Flyweight Pattern)<br>
7.组合模式(Composite Pattern)<br>

###11个行为型模式
1.模板方法模式(Template Method Pattern)<br>
2.备忘录模式(Memento Pattern)<br>
3.迭代器模式(Iterator Pattern)<br>
4.访问者模式(Visitor Pattern)<br>
5.观察者模式(Observer Pattern)<br>
6.解释器模式(Interpreter Pattern)<br>
7.中介者模式(Mediator Pattern)<br>
8.职责链模式(Chain of Responsibility Pattern)<br>
9.策略模式(Strategy Pattern)<br>
10.命令模式(Command Pattern)<br>
11.状态模式(State Pattern)<br>

关于Java设计模式学习
------------
```
Design-Pattern-Learning/
├── Chapter01_SimpleFactoryPattern（简单工厂模式）
│   ├── Product                                     产品接口
│   ├── ProductA                                    具体产品A（实现产品接口）
│   ├── ProductB                                    具体产品B（实现产品接口）
│   ├── ProductC                                    具体产品C（实现产品接口）
│   └── ProductFactory                              创建产品工厂
├── Chapter02_AbstractFactoryPattern（抽象工厂模式）
│   ├── ProductA_Phone                              产品A接口
│   ├── ProductB_Computer                           产品B接口
│   ├── ConcreteProductA1_Iphone                    具体A类产品A1（实现产品A接口）
│   ├── ConcreteProductA2_Lenove                    具体A类产品A2（实现产品A接口）
│   ├── ConcreteProductA3_Xiaomi                    具体A类产品A3（实现产品A接口）
│   ├── ConcreteProductB1_MacBook                   具体B类产品B1（实现产品B接口）
│   ├── ConcreteProductB2_ThinkPad                  具体B类产品B2（实现产品B接口）
│   ├── ConcreteProductB3_XiaomiAir                 具体B类产品B3（实现产品B接口）
│   ├── Factory                                     工厂接口
│   ├── Factory1_Apple                              具体Apple族工厂
│   ├── Factory2_Lenove                             具体Lenove族工厂
│   └── Factory3_Xiaomi                             具体Xiaomi族工厂
├── Chapter03_FactoryMethodPattern（工厂方法模式）
│   ├── Product                                     产品接口
│   ├── ConcreteProductA1                           具体产品A1（实现产品接口）
│   ├── ConcreteProductA2                           具体产品A2（实现产品接口）
│   ├── ConcreteProductA3                           具体产品A3（实现产品接口）
│   ├── Factory                                     工厂接口
│   ├── ProductFactoryA1                            具体产品A1工厂
│   ├── ProductFactoryA2                            具体产品A2工厂
│   └── ProductFactoryA3                            具体产品A3工厂
├── Chapter04_BuilderPattern（建造者模式）
│   ├── Builder                                     建造者接口
│   ├── ConcreteBuilder                             具体建造者
│   ├── Director                                    指挥者
│   └── Product                                     具体产品
├── Chapter05-SingletonPattern（单例模式）
│   ├── SingletonLazy                               懒汉式（线程不安全、懒加载）
│   ├── SingletonLazySynch                          懒汉式（线程安全、懒加载）
│   ├── SingletonHungry                             饿汉式（线程安全、非懒加载）
│   ├── SingletonDoubleChecked                      双重校验锁（double-checked locking）（线程安全、懒加载、JDK1.5以后）
│   ├── SingletonRegistration                       登记式（线程安全、懒加载）
│   └── SingletonEnum                               枚举（线程安全、懒加载、JDK1.5之后）
├── Chapter06_PrototypePattern（原型模式）
│   ├── ConcretePrototypeA                          具体原型A
│   ├── ConcretePrototypeB                          具体原型B
│   └── Prototype                                   原型接口
│   ├── ShallowClone（浅克隆）
│   │   ├── Father                                  引用类     
│   │   └── Person                                  原型类
│   ├── DeepClone（深克隆）
│   │   ├── Father                                  引用类     
│   │   └── Person                                  原型类
├── Chapter07_AdapterPattern（适配器模式）
│   ├── Target                                      目标接口
│   ├── ConcreteTarget                              目标接口实现
│   ├── Adaptee                                     被适配类
│   ├── ClassAdapter                                类适配器（继承父类特性）
│   ├── ObjAdapter                                  对象适配器（委托）
├── Chapter08_DecoratorPattern（装饰模式）
├── Chapter09_ProxyPattern（代理模式）
├── Chapter10_BridgePattern（桥接模式）
├── Chapter11_FacadePattern（外观模式）
├── Chapter12_FlyweightPattern（享元模式）
├── Chapter13_CompositePattern（组合模式）
```


### 技术交流

博客地址：[http://mynawang.com][1]

QQ群：专注的程序猿 282087535 [立即加入][2]


  [1]: http://mynawang.com
  [2]: http://shang.qq.com/wpa/qunwpa?idkey=632f7c11e0cb5dfc02231352205d9921c50e849a343e4010e4df1c25f59d2e90