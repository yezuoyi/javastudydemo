package com.study.inherit.thread;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class PoolDemo {

	public static void main(String[] args) {
		BlockingQueue<Runnable> workQueue = new LinkedBlockingDeque<>();

		MyThreadPool pool = new MyThreadPool(20, workQueue);

		for (int i = 0; i < 1000; i++) {
			//int num = i;
			pool.excute(new Task(i));
		}
		
		/**
		  () -> {
				System.out.println("线程  " + num + " 执行。。。");
			}
		 */

	}

}
