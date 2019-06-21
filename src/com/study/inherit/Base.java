package com.study.inherit;

public abstract class Base implements Action{
	
	public abstract void sysExecute(String msg);

	@Override
	public void execute(String msg) {
		System.out.println("Base==>"+msg);
	}

}
