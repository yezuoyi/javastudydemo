package com.study.inherit.thread;

public class Task extends Thread {

	private int i;

	public Task(int i) {
		super();
		this.i = i;
	}

	@Override
	public void run() {
		System.out.println("线程  " + i + " 执行。。。");
	}
}
