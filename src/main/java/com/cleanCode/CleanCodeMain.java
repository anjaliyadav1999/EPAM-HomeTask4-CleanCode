package com.cleanCode;

import java.util.Scanner;
public class CleanCodeMain {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the principal amount:");
		double principal=sc.nextDouble();
		System.out.println("Enter the rateOfInterest:");
		double rate=sc.nextDouble();
		System.out.println("Enter the timePeriod:");
		double time=sc.nextDouble();
		InterestCalculation calulate=new InterestCalculation();
		System.out.println("Simple Interest:"+calulate.SimpleInterest(principal, rate, time));
		System.out.println("Compound Interest:"+calulate.CompoundInterest(principal, rate, time));
		
		
	
		System.out.println("Enter the Standard Type:");
		String standardType = sc.next()+sc.nextLine();
		System.out.println("Enter the Area required:");
		double area=sc.nextDouble();
		System.out.println("FullyAutomated OR Not");
		boolean FullyAutomated=sc.nextBoolean();
		HouseConstructionCost hcc=new HouseConstructionCost();
		System.out.println("The Total Cost requried based on the material type: "+hcc.counstructionCost(standardType, area, FullyAutomated));
	}

}
