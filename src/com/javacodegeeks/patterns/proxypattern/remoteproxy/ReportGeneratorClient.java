package com.javacodegeeks.patterns.proxypattern.remoteproxy;

import java.rmi.Naming;

public class ReportGeneratorClient {

	public static void main(String[] args) {
		new ReportGeneratorClient().generateReport();
	}
	
	public void generateReport(){
		try {
			ReportGenerator reportGenerator = (ReportGenerator)Naming.lookup("rmi://localhost:1009/PizzaCoRemoteGenerator");
			System.out.println(reportGenerator.generateDailyReport());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
