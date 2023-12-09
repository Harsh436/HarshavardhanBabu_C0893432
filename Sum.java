public class Sum extends Binary {
    public Sum(ArithmeticExp left, ArithmeticExp right) {
        super(left, right);
    }

    // Overriding the parent class method
    @Override
    public int evaluate() {
        return left.evaluate() + right.evaluate();
    }

    // String method for representation of string concat
    @Override
    public String toString() {
        String res = String.valueOf(left) + " + " + String.valueOf(right);
        return res;
    }

}