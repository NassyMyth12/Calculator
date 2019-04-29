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
              return first / second;
      else
          throw new IllegalArgumentException("Operation not found.");
    }
}
