//package basic;

import java.lang.*;

public class FirstOne
{
	

	/**
		Constructor
	*/
	FirstOne()
	{
		System.out.println ("Yes! I am born as 'FirstOne', repeatedly telling you " + repeated );

	}

	/**
		Methodd
	*/
	//Class Variable
	private static int age = 10;

	//Instance Variable
	private int repeated = 0;
	
	
	//Private Method (Instance)
	private void tellMeASecret(String secretStr)
	{
		System.out.println ("You told me " + secretStr);
	}


	// Main Method - Entry Point PSVM :-)

	public static void main (String args[])
	{
		FirstOne first = new FirstOne();

		first.tellMeASecret("'My Name is Joy'");

		System.out.println ("My Age is " + age);

		//System.out.println ("I repeated " + repeated + " times!");

		System.out.println("I repeated " + first.repeated + "  times!");

	}
}
