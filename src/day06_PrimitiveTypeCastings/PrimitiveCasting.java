package day06_PrimitiveTypeCastings;

public class PrimitiveCasting {

    public static void main(String[] args) {

        int x = 55;
        short y = (short) x;
        //explicit casting
        System.out.println(x + ":" + y);


        long a = 1000000;
        short b = (short) a;
        System.out.println(a + ":" + b);

        short c = 797;
        int d = c;

        System.out.println(c + ":" + d);

        double l = 2.5;
        float m = (float) l;
        System.out.println(l+":"+m);

        double s= 10.8;
        int r= (int)s;
        System.out.println(s+":"+r);

        double d1 = 20.5;
        short s1 = (short) d1;
        System.out.println(d1 + ":" + s1);










    }
}
