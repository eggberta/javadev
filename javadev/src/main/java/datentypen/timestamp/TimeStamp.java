package datentypen.timestamp;


public class TimeStamp implements Date, Time {


    @Override
    public void print() {
        long zeitJetzt = System.currentTimeMillis();
        System.out.println("Aktuelle Systmzeit:" + zeitJetzt);
    }
}
