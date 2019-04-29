public class Сalculation {

    public static int Calculate(int first, String operation, int second)
    {
      if(operation.equals("+"))
        return first + second;
      if(operation.equals("-"))
            return first - second;
      if(operation.equals("*"))
            return first * second;
      if(operation.equals("/"))
      {
          try
          {
              return first / second;
          }
          catch (ArithmeticException e)
          {
              System.out.println("Division by zero.");
              return -1;
          }
      }
      else{
          System.out.println("Operation not found.");
          return -1;
      }

    }
}
