策略模式：【通过注入对象，改变行为】
演示的代码在模板模式ShoppingCastClient

策略模式核心是通过选择策略类，来执行不同的算法分支。核心是通过注入对象，改变行为
这个思想就是spring IOC 的思想
思路：
1.将每一种优惠策略（Discount接口），单独成一个组件对象，独立出来
2.使用方通过选择不同的组件，达到不同的行为

【通俗解释】传入不同的值，得到对应色service，策略模式只能选择1种方案来执行
