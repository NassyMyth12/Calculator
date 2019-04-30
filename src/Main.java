import java.util.Scanner;
import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String delimeter = " ";
        String[] symbol = a.split(delimeter, 3);

        ControlType.CheckNumbers(symbol[0], symbol[2]);

        try {
            int first = RomanToArabian.RometoArab(symbol[0]);
            int second = RomanToArabian.RometoArab(symbol[2]);
            System.out.println(ArabianToRoman.ArabtoRome(Сalculation.Calculate(first, symbol[1], second)));
        }
        catch(Exception e) {
            System.out.println(Сalculation.Calculate(parseInt(symbol[0]), symbol[1], parseInt(symbol[2])));
        }
    }
}
