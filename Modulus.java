public class Modulus extends Binary {

    public Modulus(ArithmeticExp left, ArithmeticExp right) {
        super(left, right);
    }

    // Overriding the parent class method
    @Override
    public int evaluate() {
        int rightVal = right.evaluate();
        if (rightVal == 0) {
            // handle division by zero error
            return -1;
        }
        return left.evaluate() % rightVal;
    }

    // String method for representation of string concat
    @Override
    public String toString() {
        return left + " % " + right;
    }
}