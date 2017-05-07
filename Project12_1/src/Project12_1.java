import java.util.Scanner;

public class Project12_1 {
	
	  public static void main(String[] args) {
		  
		  String[] myList = new String[3];
		  java.util.Scanner input = new java.util.Scanner(System.in);
		  
		System.out.println("Input a number.");
			myList[0] = input .next();
		System.out.println("Input an operator.");
			myList[1] = input .next();
		System.out.println("Input a number.");
			myList[2] = input .next();

	    
	    int result = 0;
	    
	    try
	    {
	    	int number = Integer.parseInt(myList[0]);
	    }
	    catch(NumberFormatException ex)
	    {
	    	System.out.println("Wrong input: " + myList[0]);
	    }
	    
	    try
	    {
	    	int number2 = Integer.parseInt(myList[2]);
	    }
	    catch(NumberFormatException ex)
	    {
	    	System.out.println("Wrong input: " + myList[2]);
	    }

	    
	    switch (myList[1].charAt(0)) { 
	      case '+': result = Integer.parseInt(myList[0]) + 
	                         Integer.parseInt(myList[2]);
	                break;
	      case '-': result = Integer.parseInt(myList[0]) -
	                         Integer.parseInt(myList[2]);
	                break;
	      case '.': result = Integer.parseInt(myList[0]) *
	                         Integer.parseInt(myList[2]);
	                break;
	      case '/': result = Integer.parseInt(myList[0]) /
	                         Integer.parseInt(myList[2]);
	    }

	    // Display result
	    System.out.println(myList[0] + ' ' + myList[1] + ' ' + myList[2]
	      + " = " + result);
	  }
	}
