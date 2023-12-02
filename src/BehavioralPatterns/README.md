# 行为型模式

行为型模式用于描述程序在运行时复杂的流程控制，即描述多个类或对象之间怎样相互协作共同完成单个对象都无法单独完成的任务，它涉及算法与对象间职责的分配。

行为型模式分为类行为模式和对象行为模式，前者采用继承机制来在类间分派行为，后者采用组合或聚合在对象间分配行为。由于组合关系或聚合关系比继承关系耦合度低，满足“合成复用原则”，所以对象行为模式比类行为模式具有更大的灵活性。

行为型模式分为：

* [模板方法模式](TemplateMethodPattern/TemplateMethod.md)
* [策略模式](StrategyPattern/Strategy.md)
* [命令模式](CommandPattern/Command.md)
* [职责链模式](ChainOfResponsibilityPattern/Responsibility.md)
* [状态模式](StatePattern/State.md)
* [观察者模式](ObserverPattern/Observer.md)
* [中介者模式](MediatorPattern/Mediator.md)
* [迭代器模式](IteratorPattern/Iterator.md)
* [访问者模式](VisitorPattern/Visitor.md)
* [备忘录模式](MementoPattern/Memento.md)
* [解释器模式](InterpreterPattern/Interpreter.md)



以上 11 种行为型模式，除了模板方法模式和解释器模式是类行为型模式，其他的全部属于对象行为型模式。

