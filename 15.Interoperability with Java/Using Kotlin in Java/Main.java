public class Main {
    public static void main(String[] args) {

        int num1 = 6, num2 = 3;

        // Call with the class name that is given in the @file:JvmName in Kotlin file
        int sum = Calculator.add(num1, num2);
        int difference = Calculator.sub(num1, num2);
        int product = Calculator.mul(num1, num2);

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