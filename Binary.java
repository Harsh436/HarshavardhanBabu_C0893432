public abstract class Binary extends ArithmeticExp {
    private ArithmeticExp left;
    private ArithmeticExp right;

    public Binary(ArithmeticExp left, ArithmeticExp right) {
        this.left = left;
        this.right = right;
    }
}