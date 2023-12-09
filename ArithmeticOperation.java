public class ArithmeticOperation {
    // Main method for function
    public static void main(String[] args) {
        ArithmeticExp term = new Sum(new Number(3), new Product(new Number(2), new Number(5)));
        // Arithematic operation
        System.out.println(term.evaluate());

        // String representation
        String stringRepresent = term.toString();
        System.out.println("\"" + stringRepresent + "\"");

        // Modulus Operation
        ArithmeticExp term2 = new Modulus(new Number(10), new Number(4));
        System.out.println(term2.evaluate());
    }
}