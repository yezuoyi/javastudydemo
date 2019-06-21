package com.study.inherit.excute;

public class WorkflowImpl extends BaseWorkflowAction {
	
	@Override
	public void excute(DoAction action, ActionArg arg) {
		action.excuteAction(arg);
	}
}
