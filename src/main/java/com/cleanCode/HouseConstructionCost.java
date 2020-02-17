package com.cleanCode;

public class HouseConstructionCost {
	double counstructionCost(String standardType,double area,boolean FullyAutomated)
	{
		double cost=area;
		if(standardType.equals("StandardMaterials") && FullyAutomated==false)
		{
			cost=cost*1200;
		}
		else if(standardType.equals("Above_standardMaterials") && FullyAutomated==false)
		{
			cost=cost*1500;
		}
		else if(standardType.equals("High_standardMaterials") && FullyAutomated==false)
		{
			cost=cost*1800;
		}
		else if(standardType.equals("High_standardMaterials") && FullyAutomated==true)
		{
			cost=cost*2500;
		}
		return cost;
	}
}
