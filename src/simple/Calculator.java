package simple;

public class Calculator
{
    
    public static void main(String[] args)
    {
        Calculator calculator = new Calculator();
        
        System.out.println(calculator.add(5,6));
    }
    
    public int add(int num1, int num2)
    {
        return num1 + num2;
    }
    
}
