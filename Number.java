class Number extends ArithmeticExp {
    private int intValue; // Encapsulation used - private restricted access

    public Number(int value) {
        this.intValue = value;
    }

    // Overriding the parent class method
    @Override
    public int evaluate() {
        return intValue;
    }

    // Override class to convert the number recieved to string and pass to other
    // classes as string value for string concat operation
    @Override
    public String toString() {
        String res = String.valueOf(intValue);
        return res;
    }
}