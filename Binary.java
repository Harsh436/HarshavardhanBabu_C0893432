public abstract class Binary extends ArithmeticExp {
    public ArithmeticExp left; // used public for other class accessing
    public ArithmeticExp right;

    public Binary(ArithmeticExp left, ArithmeticExp right) {
        this.left = left;
        this.right = right;
    }
}