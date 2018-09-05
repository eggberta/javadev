package konzepte;

public class OperatorsDemo {

    public static void main(String[] args) {

        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        int previousResult = result;
        result = result - 1;
        System.out.println(previousResult + " - 1 = " + result);
        previousResult = result;

        result = result * 10;
        System.out.println(previousResult + " * 10 = " + result);

        result = result / 5;
        System.out.println(previousResult + " / 5 = " + result);

        previousResult= result;
        result = result % 3;
        System.out.println(previousResult + " % 3 = " + result);

        previousResult = result;
        result++;
        System.out.println("result++ is now " + result);

        result--;
        System.out.println("result-- is now " + result);

        result +=2;
        System.out.println("result +=2 is now " + result);

        result *=10;
        System.out.println("result *=10 is now " + result);

        result /=5;
        System.out.println("result /=5 is now " + result);

        boolean isAlien = false;
        if (isAlien == false)
            System.out.println("This is not an alien!");

        int topScore = 100;
        if( topScore == 100)
            System.out.println("You got the high score");

        if( topScore != 100)
            System.out.println("You didn't get the high score");

        topScore = 80;
        if( topScore < 100)
            System.out.println("You get less high score");

        int secondTopScore = 60;
        if((topScore > secondTopScore) && (topScore < 100))
            System.out.println("Greater that secondTopScore and less than 100");

        if((topScore >90) || (secondTopScore <= 90))
            System.out.println("One of thess tests is true");

        int newValue = 50;
        if( newValue == 50)
            System.out.println("This is true");

        boolean isCar = false;
        if(isCar)
            System.out.println("This is a car");
        if(!isCar)
            System.out.println("This is not a car");

        boolean wasCar = isCar ? true : false;
        System.out.println("was car is " + wasCar);

        isCar = true;
        wasCar = isCar ? true : false;
        if(wasCar)
            System.out.println("wasCar is true");


        double doubleVar1 = 20d;
        double doubleVar2 = 80d;

        double doubleResult = (doubleVar1 + doubleVar2) * 25;
        double reminderResult = doubleResult % 40;
        System.out.println("reminderResult is: "+ reminderResult);

        if(reminderResult<=20)
            System.out.println("Total was over the limit");
    }
}
