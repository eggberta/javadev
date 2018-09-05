package datentypen.string;

public class StringDemo2 {

    public static void main(String[] args) {

        String myString = "This is a string";
        System.out.println(myString);
        myString = myString + ", and tis is more.";
        System.out.println(myString);
        myString = myString +  "\u00A9 2015";
        System.out.println(myString);

        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("LastSting is equal to " + lastString);
        double doubleNumber = 120.47;
        lastString = lastString + doubleNumber;
        System.out.println("LastSting value " + lastString);
    }
}
