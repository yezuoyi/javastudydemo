package com.study.inherit.excute;

public abstract class DoAction {
	private ActionArg arg;
	public DoAction(ActionArg arg) {
		this.setArg(arg);
	}
	public DoAction() {
	}


	public abstract void excute(ActionArg arg);

	public void excuteAction(ActionArg arg) {
		System.out.println("DoAction excute " +arg.getMsg());
	}
	public ActionArg getArg() {
		return arg;
	}
	public void setArg(ActionArg arg) {
		this.arg = arg;
	}
}
