package com.study.inherit.excute;

public class End extends DoAction {

	@Override
	public void excute(ActionArg arg) {
		// TODO Auto-generated method stub
		System.out.println("this is a End acton ===>" + arg.getMsg());
	}

}
