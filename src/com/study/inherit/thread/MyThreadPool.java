package com.study.inherit.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;

public class MyThreadPool {
	BlockingQueue<Runnable> workQueue;

	List<WorkThread> workThreadList = new ArrayList<>();

	public MyThreadPool(int poolSize, BlockingQueue<Runnable> workQueue) {
		this.workQueue = workQueue;
		for (int i = 0; i < poolSize; i++) {
			WorkThread workThread = new WorkThread(workQueue);

			// new Thread(workThread).start();
			workThread.start();
			workQueue.add(workThread);
		}
	}

	void excute(Runnable command) {
		workQueue.add(command);
	}

}
