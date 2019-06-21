package com.study.inherit.excute;

public class BaseWorkflowAction implements WorkflowAction {

	@Override
	public void excute(DoAction action, ActionArg arg) {
		action.excute(arg);
	}

}
