package datentypen;

public class FloatAndDoubleDemo {

    public static void main(String[] args) {

        // width of int = 32 (4 bytes)
        int myIntValue = 5 / 3;
        // width of float = 32 (4 bytes)
        float myFloatValue = 5f / 3f;
        //width of double = 64 (8 byte)
        double myDoubleValue = 5.d / 3d;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);


        double numPounds = 200d;
        double convertToKoligram = numPounds * 0.45359237d;
        System.out.println(numPounds + " pounds are equal to " + convertToKoligram + " kilograms");


        double pi = 3.141_592_7d;
        System.out.println(pi
        );
    }
}
