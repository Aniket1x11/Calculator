package simple;

public class Calculator
{
    
    public static void main(String[] args)
    {
        Calculator calculator = new Calculator();
        
        System.out.println(calculator.add(5,6));
        System.out.println(calculator.subtract(56,23));
        System.out.println(calculator.multiply(5,23));
        System.out.println(calculator.divide(81,27));
    }
    
    public int add(int num1, int num2)
    {
        return num1 + num2;
    }
    
    public int subtract(int num1, int num2)
    {
        return (num1 > num2 ? (num1 - num2) : (num2 - num1));
    }
    
    public int multiply(int num1, int num2)
    {
        return num1 * num2;
    }
    
    public int divide(int num1, int num2)
    {
        return num1 / num2;
    }
}
