访问者模式(比较复杂)：利用双重分派机制，弥补java多态中的方法重载是静态化的不足
1.集合(List<Fruit>)中由不同类型的对象，通过方法重载（形参），无法识别他们的具体类型来调用对应的方法（出错）
2.通过双重委派，可以实现遍历识别，达成目标


Fruit先accept Visit
Visit再sell;
而不是直接调用Visit的sell(输出错误)

原先是visit.sell(fruit) 
现在是fruit.accept(visit) 然后在内部visit.sell(this)
