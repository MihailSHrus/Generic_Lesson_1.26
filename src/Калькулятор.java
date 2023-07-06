public class Калькулятор {
    public static <T extends Number> double add(T a, T b) {
        return a.doubleValue() + b.doubleValue();
    }
    public static <T extends Number> double multiply(T a, T b) {
        return a.doubleValue() * b.doubleValue();
    }
    public static <T extends Number> double divide(T a, T b) {
        return a.doubleValue() / b.doubleValue();
    }
    public static <T extends Number> double subtraction(T a, T b) {
        return a.doubleValue() - b.doubleValue();
    }
}
