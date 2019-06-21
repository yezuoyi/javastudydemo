package com.study.inherit.thread;

import java.util.concurrent.BlockingQueue;

public class WorkThread extends Thread {

	BlockingQueue<Runnable> workQueue;

	public WorkThread(BlockingQueue<Runnable> workQueue) {
		super();
		this.workQueue = workQueue;
	}

	@Override
	public void run() {
		while (true) {
			Runnable task = null;
			try {
				System.out.println("running....");
				task = workQueue.take();
				task.run();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
