public class Modulus extends Binary {

    public Modulus(ArithmeticExp left, ArithmeticExp right) {
        super(left, right);
    }

    // Overriding the parent class method
    @Override
    public int evaluate() {
        int rightVal = right.evaluate();
        int leftVal = left.evaluate();
        // if (rightVal == 0) {
        // // handle division by zero error
        // return -1;
        // }
        int modVal = leftVal % rightVal;
        return modVal;
    }

    // String method for representation of string concat
    @Override
    public String toString() {
        return left + " % " + right;
    }
}