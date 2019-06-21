package com.study.inherit;

public class Concrete extends Base{

	@Override
	public void sysExecute(String msg) {
		System.out.println("Concrete====>"+msg);
		execute(msg);
	}

}
