### Source: [黑马设计模式精讲](https://www.bilibili.com/video/BV1Np4y1z7BU)



- [设计模式概述]()
- [背景知识](src/Basic.md)
- [创建型模式](src/CreationalPatterns/README.md)
  - [单例模式](src/CreationalPatterns/SingletonPattern/Singleton.md)
  - [(简单/抽象)工厂方法模式](src/CreationalPatterns/FactoryMethodPattern/FactoryMethod.md)
  - [原型模式](src/CreationalPatterns/PrototypePattern/Prototype.md)
  - [建造者模式](src/CreationalPatterns/BuilderPattern/Builder.md)
- [结构型模式](src/StructuralPatterns/README.md)
  - [代理模式](src/StructuralPatterns/ProxyPattern/Proxy.md)
  - [适配器模式](src/StructuralPatterns/AdapterPattern/Adapter.md)
  - [装饰者模式](src/StructuralPatterns/DecoratorPattern/Decorator.md)
  - [桥接模式](src/StructuralPatterns/BridgePattern/Bridge.md)
  - [外观模式](src/StructuralPatterns/FacadePattern/Facade.md)
  - [组合模式](src/StructuralPatterns/CompositePattern/Composite.md)
  - [享元模式](src/StructuralPatterns/FlyweightPattern/Flyweight.md)
- [行为型模式](src/BehavioralPatterns/README.md)
  - [模板方法模式](src/BehavioralPatterns/TemplateMethodPattern/TemplateMethod.md)
  - [策略模式](src/BehavioralPatterns/StrategyPattern/Strategy.md)
  - [命令模式](src/BehavioralPatterns/CommandPattern/Command.md)
  - [职责链模式](src/BehavioralPatterns/ChainOfResponsibilityPattern/Responsibility.md)
  - [状态模式](src/BehavioralPatterns/StatePattern/State.md)
  - [观察者模式](src/BehavioralPatterns/ObserverPattern/Observer.md)
  - [中介者模式](src/BehavioralPatterns/MediatorPattern/Mediator.md)
  - [迭代器模式](src/BehavioralPatterns/IteratorPattern/Iterator.md)
  - [访问者模式](src/BehavioralPatterns/VisitorPattern/Visitor.md)
  - [备忘录模式](src/BehavioralPatterns/MementoPattern/Memento.md)
  - [解释器模式](src/BehavioralPatterns/InterpreterPattern/Interpreter.md)
- [自定义Spring框架](src/Spring.md)



# 1，设计模式概述

## 1.1 软件设计模式的产生背景

"设计模式"最初并不是出现在软件设计中，而是被用于建筑领域的设计中。

1977年美国著名建筑大师、加利福尼亚大学伯克利分校环境结构中心主任`克里斯托夫·亚历山大（Christopher Alexander）`在他的著作《建筑模式语言：城镇、建筑、构造》中描述了一些常见的建筑设计问题，并提出了 253 种关于对城镇、邻里、住宅、花园和房间等进行设计的基本模式。

1990年软件工程界开始研讨设计模式的话题，后来召开了多次关于设计模式的研讨会。直到1995 年，艾瑞克·伽马（ErichGamma）、理査德·海尔姆（Richard Helm）、拉尔夫·约翰森（Ralph Johnson）、约翰·威利斯迪斯（John Vlissides）等 4 位作者合作出版了《设计模式：可复用面向对象软件的基础》一书，在此书中收录了 23 个设计模式，这是设计模式领域里程碑的事件，导致了软件设计模式的突破。这 4 位作者在软件开发领域里也以他们的“四人组”（Gang of Four，GoF）著称。  

## 1.2 软件设计模式的概念

软件设计模式（Software Design Pattern），又称设计模式，是一套被反复使用、多数人知晓的、经过分类编目的、代码设计经验的总结。它描述了在软件设计过程中的一些不断重复发生的问题，以及该问题的解决方案。也就是说，它是解决特定问题的一系列套路，是前辈们的代码设计经验的总结，具有一定的普遍性，可以反复使用。

## 1.3 学习设计模式的必要性

设计模式的本质是面向对象设计原则的实际运用，是对类的封装性、继承性和多态性以及类的关联关系和组合关系的充分理解。

正确使用设计模式具有以下优点。

- 可以提高程序员的思维能力、编程能力和设计能力。
- 使程序设计更加标准化、代码编制更加工程化，使软件开发效率大大提高，从而缩短软件的开发周期。
- 使设计的代码可重用性高、可读性强、可靠性高、灵活性好、可维护性强。

## 1.4 设计模式分类

* **创建型模式**

  用于描述“怎样创建对象”，它的主要特点是“将对象的创建与使用分离”。GoF（四人组）书中提供了单例、原型、工厂方法、抽象工厂、建造者等 5 种创建型模式。

* **结构型模式**

  用于描述如何将类或对象按某种布局组成更大的结构，GoF（四人组）书中提供了代理、适配器、桥接、装饰、外观、享元、组合等 7 种结构型模式。

* **行为型模式**

  用于描述类或对象之间怎样相互协作共同完成单个对象无法单独完成的任务，以及怎样分配职责。GoF（四人组）书中提供了模板方法、策略、命令、职责链、状态、观察者、中介者、迭代器、访问者、备忘录、解释器等 11 种行为型模式。


