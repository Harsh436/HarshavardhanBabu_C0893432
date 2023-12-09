class Number extends ArithmeticExp {
    private int value; // Encapsulation used - private restricted access

    public Number(int value) {
        this.value = value;
    }

    @Override
    public int evaluate() {
        return value;
    }
}