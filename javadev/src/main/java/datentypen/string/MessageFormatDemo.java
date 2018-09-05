package datentypen.string;


import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MessageFormatDemo {
  public static void main(String[] args) {

    String message = "Validation error. no ''{0}'', actual value: ''{1}''";
    String message2 = "Validation error. no %d, actual value: %s";
    String message3 = "Validation error. no %1$d, actual value: %2$s";

    String value = "null acht f�nfzehn";
    Integer errorNumber = 4711;
    Object[] arguments = new Object[2];

    arguments[0] = errorNumber;
    arguments[1] = value;

    // L�sung 1
    String ergebnis = MessageFormat.format(message, arguments);

    // Alternative L�sung:
    ergebnis = MessageFormat.format(message, errorNumber, value);
    
    System.out.println(ergebnis);
    
   
    String formattedString = String.format(message2,errorNumber, value);
    System.out.println(formattedString);
    
    String formattedString2 = String.format(message3,errorNumber, value);
    System.out.println(formattedString2);
    
    SimpleDateFormat formatter = new SimpleDateFormat("d. MMMM yyyy");
    String formattedDate = formatter.format(new Date());
    System.out.println(formattedDate);

  }
}
