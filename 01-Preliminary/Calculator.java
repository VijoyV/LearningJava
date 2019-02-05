public class Calculator
{

	//properties as variable.
	private int num1;
	private int num2;
	private String operator;

	// behaviours as Methods. Methods may have a return type.	
	public int addNumbers()
	{
		System.out.println("Adding Number " + num1 +" , " + num2 + " = " );
		return (num1 + num2);
	}	

	public int subtractNumbers()
	{
		System.out.println("Subtracting Number " + num1 +" from " + num2 + " = " );
		return (num1 - num2);
	}

	// Constructor - Sames as class name - but no return type.
	public Calculator()
	{

	}

	public Calculator(int a, int b)
	{
		num1=a;
		num2=b;
	
	}	

}