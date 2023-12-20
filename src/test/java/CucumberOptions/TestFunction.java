package CucumberOptions;

import java.util.Scanner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
					features = "src/test/java/features",
					glue = "stepdefenitions"
				)
public class TestFunction 
{
	
	public static void Program1()
	{
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter your name: ");
		        String name = scanner.nextLine();
		        System.out.println("Hello, " + name + "!" + "\n");
		        System.out.println("Running Program 1" + "\n");
	}
	
	public static void Program2()
	{
		 int number = 10;

	        if (number > 0) {
	            System.out.println("The number is positive.");
	        } else if (number < 0) {
	            System.out.println("The number is negative.");
	        } else {
	            System.out.println("The number is zero.");
	        }
		        System.out.println("Running Program 2" + "\n");
		       
	}	
	
	public static void Program3()
	{
		 for (int i = 1; i <= 2; i++) 
		 {
	            System.out.println("Iteration " + i);
	     }

	     int[] numbers = {1, 2, 3, 4, 5};
	     for (int num : numbers)
	     {
	            System.out.println(num);
	            
	     }
	     System.out.println("Running Program 3" + "\n");
	}
	
	public static void Program4()
	{
		System.out.println("The Flow is completed and running successful");
	}
	
	public static void Run()
	{
		Program1();
		Program2();
		Program3();
		Program4();
		
	}
}
