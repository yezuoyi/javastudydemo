package com.study.inherit.thread;

public class HelloThread extends Thread {

	@Override
    public void run() {
        System.out.println("Hello from a thread!fffffffff");
    }

    public static void main(String args[]) {
        (new HelloThread()).start();
    }

}
