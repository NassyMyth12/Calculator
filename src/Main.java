import java.util.Scanner;
import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String expression = sc.nextLine();
        String delimeter = " ";
        String[] symbol = expression.split(delimeter, 3);
        if(symbol.length != 3)
            throw new IllegalArgumentException("Wrong input. Enter an expression with spaces!");

        ControlType.checkNumbers(symbol[0], symbol[2]);

        try {
            int first = RomanToArabian.romeToArab(symbol[0]);
            int second = RomanToArabian.romeToArab(symbol[2]);
            System.out.println(ArabianToRoman.arabToRome(Сalculation.calculate(first, symbol[1], second)));
        } catch(Exception e) {
            System.out.println(Сalculation.calculate(parseInt(symbol[0]), symbol[1], parseInt(symbol[2])));
        }
    }
}
