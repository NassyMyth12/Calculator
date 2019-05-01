public class Сalculation {

    public static int calculate(int first, String operation, int second) {
        switch (operation) {
            case "+":
                return first + second;
            case "-":
                return first - second;
            case "*":
                return first * second;
            case "/":
                return first / second;
            default:
                throw new IllegalArgumentException("Operation not found.");
        }
    }
}
