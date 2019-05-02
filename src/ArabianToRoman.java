public class ArabianToRoman {


    public static String arabToRome(int arab) {
        StringBuffer romeNumber = new StringBuffer("");

        int m = arab / 1000;
        if(m > 0) {
            for(int i = 0; i < m; i++)
                romeNumber.append("M");
        }
        int m1 = arab % 1000;

        int d = m1 / 100;
        if(d == 9)
            romeNumber.append("CM");
        if(d > 4 && d < 9) {
            romeNumber.append("D");
            for(int i = 0; i < (d-5); i++)
                romeNumber.append("C");
        }
        if(d == 4)
            romeNumber.append("CD");
        if(d > 0 && d < 4){
            for(int i = 0; i < d; i++)
                romeNumber.append("C");
        }
        int d1 = m1 % 100;

        int l = d1 / 10;

        if(l == 9)
            romeNumber.append("XC");
        if(l > 4 && l < 9) {
            romeNumber.append("L");
            for(int i = 0; i < (l-5); i++)
                romeNumber.append("X");
        }
        if(l == 4)
            romeNumber.append("XL");
        if(l > 0 && l < 4) {
            for(int i = 0; i < l; i++)
                romeNumber.append("X");
        }
        int l1 = d1 % 10;

        int x = l1;
        if(x == 9)
            romeNumber.append("IX");
        if(x > 4 && x < 9) {
            romeNumber.append("V");
            for(int i = 0; i < (x-5); i++)
                romeNumber.append("I");
        }
        if(x == 4)
            romeNumber.append("IV");
        if(x > 0 && x < 4) {
            for(int i = 0; i < x; i++)
                romeNumber.append("I");
        }
        return romeNumber.toString();
    }
}
