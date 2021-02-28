package com.wondes.demo.enjoy.structure.adapter;

import com.wondes.demo.enjoy.entity.bag.AppleBag;
import com.wondes.demo.enjoy.entity.bag.OrangeBag;
import com.wondes.demo.enjoy.entity.fruit.Orange;

/**
 * 适配器，想要的没有（orangeBag），有的不能用(AppleBag)，那么通过适配器来进行处理
 * 把苹果盒子伪装成橘子盒子
 */
public class AdapterClient {
	public static void main(String[] args){
		Orange orange = new Orange("peter",100);
		OrangeBag bag = getBag2();
		orange.pack(bag);
	}

	/**
	 * 取桔子包装
	 * @return
     */
//	private static OrangeBag getBag(){
//		OrangeBag bag = new OrangeBag();
//		return bag;
//	}

	private static OrangeBag getBag2(){
		//准备用途苹果盒代替
		AppleBag appleBag = new AppleBag();

		//把苹果盒适配成桔子包装盒
		OrangeBag orangeBag = new OrangeBagAdapter(appleBag);

		return orangeBag;
	}
}
