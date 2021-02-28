适配器模式：
需要orangeBag 但是他没有包装盒了，只有appleBag，需要用AppleBag替代，
可以通过OrangeBagAdapter进行转换（伪装）
1.OrangeBagAdapter继承OrangeBag的功能，同时组合AppleBag对象，
使OrangeBag与AppleBag产生联系

PS:OrangeBag和AppleBag都是已有的类，是系统已有方法，整个过程，
只新增了一个OrangeBagAdapter类，去充当OrangeBag实现
