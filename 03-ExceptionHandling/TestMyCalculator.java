public class TestMyCalculator {

    public static void main(String arg[])
    {
        CalculatorOpsIntf aCalculator = new MyCalculator();

        int a = Integer.parseInt(arg[0]);
        String opr = arg[1];
        int b = Integer.parseInt(arg[2]);

        if (opr.equals("+"))
        {
            System.out.println(a + opr + b + "=" + aCalculator.addNumbers(a, b));
        }
        else if (opr.equals("-"))
        {
            System.out.println(a + opr + b + "=" + aCalculator.subtractNumbers(a, b));
        }
        else if (opr.equals("*"))
        {
            System.out.println(a + opr + b + "=" + aCalculator.multiplyNumbers(a, b));
        }
        else if (opr.equals("/"))
        {
            try
            {
                System.out.println(a + opr + b + "=" + aCalculator.divideNumbers(a, b));
            }
            catch(java.lang.ArithmeticException ae)
            {
                System.out.println(ae.getMessage());
            }
        }
        else
        {
            System.out.println("Inavlid Operator, " + opr);
        }

    }
}
