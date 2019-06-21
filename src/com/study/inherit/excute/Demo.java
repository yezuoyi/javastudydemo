package com.study.inherit.excute;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BaseWorkflowAction base = new BaseWorkflowAction();
		WorkflowImpl impl = new WorkflowImpl();
		
		List<WorkflowAction> list = new ArrayList<>();
		list.add(base);
		list.add(impl);
		
		for(WorkflowAction action : list) {
			action.excute(new Start(), new ActionArg("Test"));
			action.excute(new End(), new ActionArg("Test"));
			System.out.println();
		}
		
	}

}
