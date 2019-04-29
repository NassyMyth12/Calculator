
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();

        String delimeter = " ";
        String[] symbol = a.split(delimeter, 3);

        try {
            System.out.println(Сalculation.Calculate(parseInt(symbol[0]), symbol[1], parseInt(symbol[2])));
        }
        catch (Exception e){
            int first = RomanToArabian.RometoArab(symbol[0]);
            int second = RomanToArabian.RometoArab(symbol[2]);
            System.out.println(Сalculation.Calculate(first, symbol[1], second));
        }
        //3 + 5
        //III + V
    }
    }
