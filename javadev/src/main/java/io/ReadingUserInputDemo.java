package io;

import java.util.Scanner;

public class ReadingUserInputDemo {

    public static void main(String[] args) {

        demoReadingUserInput();
//        demoReadingUserInputNumbers();
//        demoReadingUserInputMinMaxNumbers();
    }

    private static void demoReadingUserInputMinMaxNumbers() {

        Scanner scanner = new Scanner(System.in);

        int min = 0;
        int max = 0;
        boolean first = true;

        while (true) {

            System.out.println(" Enter number or 'a' to exit: ");
            boolean isAnInt = scanner.hasNextInt();


            if (isAnInt) {
                int number = scanner.nextInt();

                if(first){
                    first = false;
                    min = number;
                    max = number;
                }

                if (number > max) {
                    max = number;
                }
                if (number < min) {
                    min = number;
                }
            } else {
                break;
            }
            scanner.nextLine();

        }

        System.out.println("min= " + min + ", max= " + max);

        scanner.close();
    }

    private static void demoReadingUserInput() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of birth: ");
        boolean hasNextInt = scanner.hasNextInt();
        if (hasNextInt) {

            int yearOfBirth = scanner.nextInt();
            scanner.nextLine(); // handle next Line Character (entry key)1970
            System.out.println("Enter your name: ");
            String name = scanner.nextLine();

            int age = 2018 - yearOfBirth;

            if (age >= 0 && age <= 100) {
                System.out.println("Your name is " + name + ", and you are " + age + " years old.");
            } else {
                System.out.println("Ivalid year of birth");
            }

        } else {
            System.out.println("Unable to parse year of birth");
        }

        scanner.close();

    }

    private static void demoReadingUserInputNumbers() {

        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int sum = 0;

        while (counter < 10) {
            int order = counter + 1;
            System.out.println("Enter number#" + order + ": ");

            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                int number = scanner.nextInt();
                counter++;
                sum += number;
            } else {
                System.out.println("Invalid number");
            }
            scanner.nextLine(); // handle end of line (entry key)
        }

        System.out.println(" sum = " + sum);
        scanner.close();

    }


}
