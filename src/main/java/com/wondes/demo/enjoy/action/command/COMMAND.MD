命令模式：通过增加Command抽象命令类，将不符合抽象编程的handler调用，转为抽象编程

这个模式就是增加了一个中间层,来实现接口化管理
场景是ListView是前段首页模块，数据可能会更新变化
最开始ListView每个界面对应一个Handler(DiscountHandler,HotHandler,NewerHandler)
直接请求，依赖关系太强，Handler类的改变，需要修改ListView

原先：ListView--->Handler (2着一一对应)
改进：ListView--->Command--->Handler

说白了最开始前端就是一个ListView对应一个Handler 直来直去的调用
现在为了接口化，ListView里面包Command,Command再包Handler

个人认为这种模式场景不甚多 尤其C端应该尽量简单 一个调用一个接口 问题不大 糅合在一起 
扩展起来反倒是自找苦吃！



