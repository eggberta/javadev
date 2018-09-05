package konzepte;

public class SchleifenDemo {

    public static void main(String[] args) {
        demoZaehlSchleifen();
        demoWhileSchleifen();
        demoDoWhileSchleifen();
        demoFlieszkommmaZahlen();
        demoSchleifePartiellUnterbrechen();
    }



    private static  void demoZaehlSchleifen() {
        for (int i = 0; i < 5; i++) {
            System.out.println("for-Schleife: " + i);
        }
    }

    private static void demoWhileSchleifen() {
        int i = 0;
        while (i < 5) {
            System.out.println("while-Schleife: " + i);
            i++;
        }
    }

    private static  void demoDoWhileSchleifen() {
        int i = 0;
        do {
            System.out.println("do-while-Schleife: " + i);
            i++;
        } while (i < 5);
    }

    private static void demoFlieszkommmaZahlen() {

        float ergebnisFloat = 0.0F;
        double ergebnisDouble = 0.0;

        for (int i = 0; i < 20; i++) {

            ergebnisFloat = ergebnisFloat + 0.1F;
            ergebnisDouble = ergebnisDouble + 0.1;

            System.out.println("ergebnis float: " + ergebnisFloat);
            System.out.println("ergebnis double: " + ergebnisDouble);
        }
    }

    private static void demoSchleifePartiellUnterbrechen() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Schleife mit Unterbrechung, break: " + i);
            break;  // break verlässt die Schleife
        }
        for (int i = 0; i < 5; i++) {
            if (i > 2) {
                continue; // Springt ans Ende der Schleife
            }
            System.out.println("Schleife mit Unterbrechung, continue: " + i);
        }

    }

}
