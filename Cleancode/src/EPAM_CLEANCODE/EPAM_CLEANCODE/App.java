package EPAM_CLEANCODE.EPAM_CLEANCODE;

import java.io.IOException;
import java.io.PrintStream;
import java.math.BigDecimal;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args ) throws UnknownHostException, IOException
    {
    	int choice;
        @SuppressWarnings("resource")
		Scanner  sc=new Scanner(System.in);
    	@SuppressWarnings("resource")
		Socket s= new Socket( "localhost",8888 );
    	@SuppressWarnings("resource")
		Scanner sc1=new Scanner(s.getInputStream());
    	PrintStream p=new PrintStream(s.getOutputStream());
    	
    
    		System.out.println("Enter any choice");
    	System.out.println("1.SimpleInterest\n2.CompoundInterest\n3.HouseCostEstimation");
    	choice=sc.nextInt();
    	p.println(choice);
    	
    
    	
    	 
    	BigDecimal Result=sc1.nextBigDecimal();
    	if(Result.equals(new BigDecimal(Integer.MIN_VALUE)))
    	{
    		System.err.println("Invalid Choice");
    	}
    	else
    		
    	{
    		
    		
    	 	System.out.println(Result);
    	}
    	
    }
}

