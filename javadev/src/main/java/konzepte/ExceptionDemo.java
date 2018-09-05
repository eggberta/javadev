package konzepte;

import java.io.FileNotFoundException;

public class ExceptionDemo {
    public ExceptionDemo() {

        try {
            methode1();
        } catch (FileNotFoundException e) {
 //           e.printStackTrace();
            String message = e.getMessage(); // Fehlertext;
            System.out.println(message);

        } catch (NullPointerException e) {
 //           e.printStackTrace();
            String message = e.getMessage(); // Fehlertext;
            System.out.println(message);
        }
    }


    private void methode1() throws FileNotFoundException {
        System.out.println("ExeceptionDemo.methode1()");
        methode2();
        FileNotFoundException aktuellerFehler = new FileNotFoundException("Die Datei konnte nicht gefunden werden.");
        throw aktuellerFehler;

    }

    private void methode2() {
        System.out.println("ExeceptionDemo.methode2()");
        throw new NullPointerException("NullPonterException für Demozwecke");
    }
}
