public class RomanToArabian {

        static String[] Rome = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        static int[] Arab = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        public static int RometoArab(String rome){

            StringBuffer romeNumber = new StringBuffer(rome);
            int arabNumber = 0, i = 0;
            if (romeNumber.length() > 0)
            {
                while (true) {
                    do {
                        if (Rome[i].length() <= romeNumber.length()) {
                            if (Rome[i].equals(romeNumber.substring(0, Rome[i].length())))
                            {
                                arabNumber += Arab[i];
                                // и удаляем из строки римскую цифру
                                romeNumber.delete(0, Rome[i].length());
                                if (romeNumber.length() == 0)
                                    return arabNumber;
                            }
                            else
                                break;
                        }
                        else
                            break;
                    }
                    while (true && romeNumber.length() != 0);
                    i++;
                }
            }
            return 0;

        }
    }


