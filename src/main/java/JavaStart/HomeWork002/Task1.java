package JavaStart.HomeWork002;

public class Task1 {

    public static void byteType() {
        byte byteType1 = -128;
        byte byteType2 = 127;

        System.out.println(byteType1);
        System.out.println(byteType2);
    }

    public static void shortType() {
        short shortType1 = -32768;
        short shortType2 = 32767;

        System.out.println(shortType1);
        System.out.println(shortType2);
    }

    public static void intType() {
        int intType1 = -2147483648;
        int intType2 = 2147483647;

        System.out.println(intType1);
        System.out.println(intType2);
    }

    public static void longType() {
        long longType1 = -9223372036854775808L;
        long longType2 = 922337203685477580L;

        System.out.println(longType1);
        System.out.println(longType2);
    }

    public static void booleanType() {
        boolean booleanType1 = true;
        boolean booleanType2 = false;

        System.out.println(booleanType1);
        System.out.println(booleanType2);
    }

    public static void doubleType() {
        double doubleType1 = 1.79769313486231570e+308;
        double doubleType2 = 4.94065645841246544e-324;

        System.out.println(doubleType1);
        System.out.println(doubleType2);
    }

    public static void floatType() {
        float floatType1 = -9.123456789123456789123456789F;
        float floatType2 = 9.123456789123456789123456789F;

        System.out.println(floatType1);
        System.out.println(floatType2);
    }

    public static void charType() {
        char charType1 = 'A';
        char charType2 = '$';

        System.out.println(charType1);
        System.out.println(charType2);
    }


    public static void main(String[] args) {
        byteType();
        shortType();
        intType();
        longType();
        booleanType();
        doubleType();
        floatType();
        charType();
    }

}
