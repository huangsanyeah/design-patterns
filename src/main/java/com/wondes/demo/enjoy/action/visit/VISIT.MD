访问者模式(比较复杂)：利用双重分派机制，弥补java多态中的方法重载是静态化的不足
Fruit先accept Visit
Visit再sell;
而不是直接调用Visit的sell(输出错误)

原先是visit.sell(fruit) 
现在是fruit.accept(visit) 然后在内部visit.sell(this)
