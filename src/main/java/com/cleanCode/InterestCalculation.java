package com.cleanCode;

public class InterestCalculation {
	double SimpleInterest(double principal,double rate,double time)
	{
		double SI=(principal*rate*time)/100;
		return SI;
	}
	double CompoundInterest(double principal,double rate,double time)
	{
		double CI=principal*(Math.pow((1+rate/100),time));
		return CI;
	}

}
