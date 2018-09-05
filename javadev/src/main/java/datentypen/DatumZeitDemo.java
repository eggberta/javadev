package datentypen;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class DatumZeitDemo {

    public static void main(String[] args) {
        demoDatumZeit();
    }

    public static void demoDatumZeit() {
        System.out.println("");
        System.out.println("---------------------------------------------------------");
        System.out.println("DatumZeit-Demo");
        System.out.println("---------------------------------------------------------");

        String datum1 = "25.08.2017";

        Date date1 = new Date();
        System.out.println(date1);

        SimpleDateFormat formatter1 = new SimpleDateFormat("dd. MMMM yyyy");
        String fomratiertesDatum1 = formatter1.format(date1);
        System.out.println(fomratiertesDatum1);

        SimpleDateFormat formatter2 = new SimpleDateFormat("dd.MM.yyyy");
        String fomratiertesDatum2 = formatter2.format(date1);
        System.out.println(fomratiertesDatum2);

        String datum2 = "25.02.2018";
//        Date date2 = formatter2.parse(datum2);
//        System.out.println(date2);

        GregorianCalendar calendar = new GregorianCalendar();
        int aktuellerMonat = calendar.get(Calendar.MONTH); // Achtung zaehlt von 0-11
        System.out.println("Aktueller Monat ist: " + aktuellerMonat);
        int aktuellerTagImMonat = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println("Aktueller Tag ist: " + aktuellerTagImMonat);

        LocalDate heute = LocalDate.now();
        LocalDate zweiMonateWeiter = heute.plus(2, ChronoUnit.MONTHS);
        System.out.println("Aktueller Tag + 2 Monate: " + zweiMonateWeiter);


    }

}
