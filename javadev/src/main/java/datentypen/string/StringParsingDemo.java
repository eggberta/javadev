package datentypen.string;

public class StringParsingDemo {

    public static void main(String[] args) {
        demoStringParsing();
    }

    private static void demoStringParsing() {

        String intAsString = "2018";
        String doubleAsString ="2018.125";
        System.out.println("numberAsString= " + intAsString);

        int intNumber = Integer.parseInt(intAsString);

        double doubleNumber = Double.parseDouble((doubleAsString));

        System.out.println("intNumber= " + intNumber);
        System.out.println("DoubleNumber= " + doubleNumber);

        intAsString +=1;
        intNumber+=1;
        doubleNumber+=1;

        System.out.println("intAsString+1=  :" + intAsString);
        System.out.println("intNumber+=1 : " + intNumber);
        System.out.println("doubleNumber+=1 : " + doubleNumber);


    }
}
