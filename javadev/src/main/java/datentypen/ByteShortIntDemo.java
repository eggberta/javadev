package datentypen;

public class ByteShortIntDemo {

    public static void main(String[] args) {
        // Integger has a width of 32
        int myMinIntValue=-2_147_483_648;
        int myMaxIntValue=2_147_483_647;
        System.out.println("Mininaler Wert für Integer: " + myMinIntValue);
        System.out.println("Maximaler Wert für Integer: " + myMaxIntValue);
        int myNewInt = (myMinIntValue/2);
        System.out.println("int myNewInt = (myMinIntValue/2): " + myNewInt);

        // byte has a widht  of 8
        byte myMinByteValue = -128;
        byte myMaxByteValue = 127;
        System.out.println("Mininaler Wert für Byte: " + myMinByteValue);
        System.out.println("Maximaler Wert für Byte: " + myMaxByteValue);
        byte myNewByteValue = (byte) (myMinByteValue/2);
        System.out.println("byte myNewByteValue = (byte) (myMinByteValue/2): " + myNewByteValue);

        //short has width of 16
        short myMinShortValue = -32_768;
        short myMaxShortValue = 32_767;
        System.out.println("Mininaler Wert für Short: " + myMinShortValue);
        System.out.println("Maximaler Wert für Short: " + myMaxShortValue);

        //long has width of 64
        long myMinLongValue = -9_223_372_036_854_775_808L;
        long myMaxLongValue = 9_223_372_036_854_775_807L;
        System.out.println("Mininaler Wert für Long: " + myMinLongValue);
        System.out.println("Maximaler Wert für Long: " + myMaxLongValue);

        byte byteValue = 10;
        short shortValue = 20;
        int intValue = 50;

        long longTotal = 50000L + 10*(byteValue + shortValue + intValue);
        short shortTotal = (short) (1000 + 10 * (byteValue + shortValue + intValue));
        System.out.println("longTotal: " + longTotal);
        System.out.println("shortTotal: " + shortTotal);

    }
}
