public class CalculatorMain {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int result = calc.add(10, 20);
	int subRes = calc.subtract(20,20);
        System.out.println("Result: " + result);
	System.out.println("Result subtraction: " + subRes);
    }
}