package EPAM_CLEANCODE.EPAM_CLEANCODE;

import java.math.BigDecimal;
import java.util.Scanner;

public class BuildingCostEstimation {
	static Scanner sc1=new Scanner(System.in);
	private BigDecimal costPerSquareFeet;
	 private BigDecimal houseArea, totalBuildingCost;
	int choice;
	public BuildingCostEstimation()
	{
		System.out.println("Enter the area of house in Squarefeets");
	   this.houseArea=sc1.nextBigDecimal();
		System.out.println("Choose the material for constructing house");
		System.out.println("1.Standard Material\n2.Above Standard Material\n 3.High Standard Material \n4.High Standard With Fully Automated home");
         this.choice=sc1.nextInt();
        
	}
	
	
	public  BigDecimal BuildingCost() {
	switch(choice)
	{
	case 1: costPerSquareFeet=new BigDecimal(1200);
	        this.totalBuildingCost=costPerSquareFeet.multiply(houseArea);
	        break;
	case 2:this.costPerSquareFeet=new BigDecimal(1500);
    this.totalBuildingCost=costPerSquareFeet.multiply(houseArea);
    break;
	case 3:this.costPerSquareFeet=new BigDecimal(1800);
    this.totalBuildingCost=costPerSquareFeet.multiply(houseArea);
    break;
	case 4:this.costPerSquareFeet=new BigDecimal(2500);
    this.totalBuildingCost=costPerSquareFeet.multiply(houseArea);
    break;
    default: BigDecimal Err=new BigDecimal(Integer.MIN_VALUE);
	System.err.println("Invalid Choice");
    this.totalBuildingCost= Err;
	
	}
	return totalBuildingCost;
	}

}

