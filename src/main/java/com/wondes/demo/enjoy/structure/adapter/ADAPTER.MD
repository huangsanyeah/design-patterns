适配器模式：
需要orangeBag 但是他没有包装盒了，只有appleBag，需要用AppleBag替代，
可以通过OrangeBagAdapter进行转换（伪装）
1.OrangeBagAdapter继承OrangeBag的功能，同时组合AppleBag对象，
使OrangeBag与AppleBag产生联系

PS:OrangeBag和AppleBag都是已有的类，是系统已有方法，整个过程，
只新增了一个OrangeBagAdapter类，去充当OrangeBag实现


大白话解释：
A对象的方法没有实现，B对象有，通过适配器类把B对象注入内部，A调用的时候就可以直接
使用B对象的方法了

适配器的目标是【合并】，桥接模式的目标是【分离】
偶尔使用，适合诸葛亮 大量使用会引起混乱
