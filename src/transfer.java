public class transfer {
    public static void main(String[] args) {
        //short = integer
        short shortValue = 30000;
        int intValue = (int) shortValue;
        System.out.println(intValue);

        //integer = short
        int val2 = 50000;
        short shortV2 = (short) val2;
        System.out.println(shortV2);

        //integer = float
        int valV2 = 125;
        float floatVal = (float) valV2;
        System.out.println(floatVal);

        //dooble = long
        double doubleVal = 255.244;
        long LongVal = (long) doubleVal;
        System.out.println(LongVal);

        //long = float
        long longVal = 3_000_000_000L;
        float floatValV2 = (float) longVal;
        System.out.println(floatValV2);

        //char = integer
        char charVal = '@';
        int intValV3 = (int) charVal;
        System.out.println(intValV3);

        //integer = char
        int intVal = 65;
        char charValV2 = (char) intVal;
        System.out.println(charValV2);

    }
}
