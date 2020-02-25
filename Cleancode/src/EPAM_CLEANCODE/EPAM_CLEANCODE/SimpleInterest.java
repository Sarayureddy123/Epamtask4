package EPAM_CLEANCODE.EPAM_CLEANCODE;

import java.math.BigDecimal;
import java.util.Scanner;

public class SimpleInterest {
	static Scanner sc1=new Scanner(System.in);
	 BigDecimal principleAmount;
	  BigDecimal interestRate;
	  BigDecimal timePeriod;
	
	public SimpleInterest()
	{
		
		System.out.println("******************SimpleIntrest Calculator*******************");
        System.out.println("Enter Principle amount");
       this.principleAmount=sc1.nextBigDecimal();
        System.out.println("Enter Rate of Intrest");
        this.interestRate=sc1.nextBigDecimal();
        System.out.println("Enter Time Period");
        this.timePeriod=sc1.nextBigDecimal();
	}
	
	public  BigDecimal SimpleInterestResult()
	{
		BigDecimal P=principleAmount;
		BigDecimal R=interestRate;
		BigDecimal T= timePeriod;
		BigDecimal simpleInterest=(P.multiply(T.multiply(R))).divide(new BigDecimal(100));
		return simpleInterest;
		
	}
	
	
	
}
