package com.sxt.others;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * CAS:比较并交换
 * 
 * @author 裴新 QQ:3401997271
 *
 */
public class CAS {
	//库存
	private static AtomicInteger stock = new AtomicInteger(5);
	public static void main(String[] args) {
		for(int i=0;i<5;i++) {
			new Thread(()->{
				//模拟网络延时
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				Integer left = stock.decrementAndGet();
				if(left<1) {
					System.out.println("抢完了...");
					return ;
				}
				System.out.print(Thread.currentThread().getName()+"抢了一件商品");
				System.out.println("-->还剩"+left);
			}) .start();
		}
	}

}
