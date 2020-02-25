package EPAM_CLEANCODE.EPAM_CLEANCODE;
import java.io.*;
import java.math.BigDecimal;
import java.net.*; 
import java.util.*;
public class MyServer {  
public static void main(String[] args){  
try{  
	int choice;
ServerSocket ss=new ServerSocket(8888);  
Socket s=ss.accept();//establishes connection 
@SuppressWarnings("resource")
Scanner sc1=new Scanner(s.getInputStream());  
choice=sc1.nextInt();
PrintStream p=new PrintStream(s.getOutputStream());
switch(choice)
{
case 1:SimpleInterest SimpleInterestObject=new SimpleInterest();
       BigDecimal SimpleInterestResult=SimpleInterestObject.SimpleInterestResult();
       p.println(SimpleInterestResult);
       break;
case 2: CompoundInterest CompoundInterestObject=new CompoundInterest();
	    BigDecimal CompoundInterestResult=CompoundInterestObject.CompoundInterestResult();
        p.println(CompoundInterestResult);
        break;
case 3:BuildingCostEstimation BuildingCostObject=new BuildingCostEstimation();
       BigDecimal BuildingCost=BuildingCostObject.BuildingCost();  
       p.println(BuildingCost);
       break;
default:BigDecimal Err=new BigDecimal(Integer.MIN_VALUE);
	    p.println(Err);    

}

ss.close();
}catch(Exception e){System.out.println(e);}  
}  
}