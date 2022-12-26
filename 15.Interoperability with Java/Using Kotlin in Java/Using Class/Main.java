public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        int num1 = 6, num2 = 3;

        int sum = calculator.add(num1, num2);
        int difference = calculator.sub(num1, num2);
        int product = calculator.mul(num1, num2);

        System.out.printf(
                "Sum: %d\nDifference: %d\nProduct: %d",
                sum,
                difference,
                product
        );

        /*
        Output:
        Sum: 9
        Difference: 3
        Product: 18
         */

    }
}