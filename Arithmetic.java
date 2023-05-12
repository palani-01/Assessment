public class Arithmetic {
    private int first_value;
    private int second_value;

    public Arithmetic(int first_value, int second_value) {
        this.first_value = first_value;
        this.second_value = second_value;
    }

    public int getFirst_value() {
        return first_value;
    }

    public void setFirst_value(int first_value) {
        this.first_value = first_value;
    }

    public int getSecond_value() {
        return second_value;
    }

    public void setSecond_value(int second_value) {
        this.second_value = second_value;
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int mul(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) {
        return a / b;
    }

}
