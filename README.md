# design-patterns设计模式

##总原则：开闭原则（Open Close Principle）
开闭原则就是说对【扩展开放，对修改关闭】。在程序需要进行拓展的时候，不能去修改原有的代码，而是要扩展原有代码，实现一个热插拔的效果。
所以一句话概括就是：为了使程序的扩展性好，易于维护和升级。想要达到这样的效果，我们需要使用接口和抽象类等，后面的具体设计中我们会提到这点

##一、单一职责原则(Single Responsibility Principle)

定义：就一个类而言， 应该仅有一个引起它变化的原因。

单一职责的划分界限并不是那么清晰，很多时候需要靠个人经验界定。当然最大的问题就是对职责的定义，什么是类的职责，以及怎么划分类的职责。

##二、开放封闭原则（Open Close Principle）

定义：类、模块、函数等应该是可以拓展的，但是不可修改。

开闭原则指导我们，当软件需要变化时，应该尽量通过拓展的方式来实现变化，而不是通过修改已有代码来实现。这里的“应该尽量”4个字说明OCP原则并不是说绝对不可以修改原始类的。当我们嗅到原来的代码“腐化气味”时，应该尽早地重构，以便使代码恢复到正常的“进化”过程，而不是通过集成等方式添加新的实现，这会导致类型的膨胀以及历史遗留代码的冗余。因此，在开发过程中需要自己结合具体情况进行考量，是通过修改旧代码还是通过继承使得软件系统更稳定、更灵活，在保证去除“代码腐化”的同时，也保证原有模块的正确性。

##三、里氏替换原则（Liskov Substitution Principle）
注：它是开闭原则的具体实现手段之一，它的核心原理是抽象
定义：所有引用基类的地方必须能透明地使用其子类的对象。

里氏替换原则的核心原理是抽象，抽象又依赖于继承这个特性，在OOP中，继承的优缺点相当明显，
###优点如下：
1. 代码重用，减少创建类成本，每个子类拥有父类的属性和方法；
2. 子类和父类基本相似，但又与父类有所区别；
3. 提高代码的可拓展性。
###继承的缺点：
1. 继承是侵入性的，只要继承就必须拥有父类的所有属性和方法；
2. 可能造成子类代码的冗余、灵活性降低，因为子类必须拥有父类的属性和方法。
开闭原则和里氏替换原则往往是生死相依、不离不弃的，通过里氏替换来达到对扩展的开发，对修改的关闭效果。

##四、依赖倒置原则（Dependence Inversion Principle）
注：关系到系统的可拓展性、拥抱变化的能力、开闭原则

定义：高层模块不应该依赖于低层模块，两者都应该依赖于抽象。抽象不应该依赖于细节，细节应该依赖于抽象。

java中抽象指【接口】或【抽象类】，两者都不能直接被实例化的；
细节就是实现类，实现接口或者集成抽象类而产生的也就细节，也就是可以可以加上一个关键字new产生的对象。
高层模块就是调用端，低层模块就是具体实现类。
依赖倒置原则在java中表现就是，模块间依赖通过抽象发生，实现类之间不发生直接依赖关系，其依赖关系是通过【接口或者抽象类】产生的。
如果类与类直接依赖细节，那么久会直接耦合。如此一来当修改时，就会同时修改依赖者代码，这样限制了可拓展性。

##五、 接口隔离原则（InterfaceSegregation Principles）
注：最小化， 减少依赖从而降低变更的风险。

定义：一个类对另一个类的依赖应该建立在最小的接口上。

建立单一接口，不要建立庞大臃肿接口；尽量细化接口，接口中方法尽量少。也就是说，我们要为各个类建立专用的接口，而不要试图建立一个很庞大的接口供所有依赖它的类调用。
1. 接口尽量小，但是要有限度。对接口进行细化可以提高程序设计的灵活性；但是如果过小，则会造成接口数量过多，使设计复杂化。所以，一定要适度。
2. 为依赖接口的类定制服务，只暴露给调用的类需要的方法，它不需要的方法则隐蔽起来。只有专注得为一个模块提供定制服务，才能建立最小的依赖关系。
3. 提高内聚，减少对外交互。接口方法尽量少用public修饰。接口是对外的承诺，承诺越少对系统开发越有利，变更风险也会越少。

以上（单一职责、开闭原则、里氏替换、接口隔离、依赖倒置）五个原则被Bob大叔在21世纪早期定义为SOLID原则。
作为面向对象编程的5个基本原则，当这些原则被一起使用时，它们使得一个软件系统更清晰、简单，最大程度地拥抱变化。

##六、 迪米特原则（Law of Demeter）也称最少知识原则
注：通过引入一个合理的第三者降低现有对象之间的耦合度。

定义：一个软件实体应当尽可能少地与其他实体发生相互作用。

一个类应该对自己需要耦合或者调用的类知道最少， 类的内部如何实现与调用者或者依赖关系越密切，耦合度越大，当一个类发生变化时，对另一个类的影响也越大。
1. 在类的划分上，应当尽量创建松耦合的类。类之间的耦合度约低，就越有利于服用。一个处于松耦合中的类一旦被修改，则不会对关联的类造成太大的波及。
2. 在类的机构设计上，每一个类都应当尽量降低其成员变量和成员函数的访问权限。
3. 在对其他类的引用上，一个类对其他对象的引用应当降到最低。

作者：zyl409214686
链接：https://juejin.cn/post/6844903545561432077
来源：掘金
转载，著作权归作者所有

#重要的设计模式

#待查询的设计模式
责任链
观察者
策略模式的多种实现
工厂模式
