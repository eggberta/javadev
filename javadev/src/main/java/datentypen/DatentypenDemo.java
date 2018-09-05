package datentypen;


public class DatentypenDemo {


    public static void main(String[] args) {
        datentypenDemo();
    }


    public static void datentypenDemo() {

        byte zahlByte = 125; // 8 Bit, mit Vorzeichen, binär
        short zahlShort = 30000; // 16 Bit, mit Vorzeichen, binär
        int zahlInt = 1234567; // 32 Bit, mit Vorzeichen, binär
        long zahlLong = 1234567890; // 64 Bit, mit Vorzeichen, binär

        float zahlFloat = 3.1415F; // 32 Bit, mit Vorzeichen, fließkommma
        double zahlDouble = 1E+20; // 64 Bit, mit Vorzeichen, fließkommma

        boolean schalter = true; // true oder false
        char zeichen = 'ß'; // 16 bit Unicode

        String omegaString = "\u03A9"; // Omega in String
        char omegaChar = '\u03A9'; // Omega in Zeichen
        char omegaZeichen ='Ω';
        System.out.println(zahlByte);
        System.out.println(zahlShort);
        System.out.println(zahlInt);
        System.out.println(zahlLong);
        System.out.println(zahlFloat);
        System.out.println(zahlDouble);
        System.out.println(schalter);
        System.out.println(zeichen);

        System.out.println("Ausgabe Omega-String: " + omegaString);

        System.out.println("Ausgabe Omega-Character: " + omegaChar);

        System.out.println("Ausgabe Omega-Zeichen: " + omegaZeichen);

    }


}
