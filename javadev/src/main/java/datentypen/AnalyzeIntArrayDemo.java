package examples.arrayanalyzer;

import java.util.Arrays;
import java.util.Scanner;


public class AnalyzeIntArrayDemo {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Wieviele Elemente wollen Sie im Array speichern?");
        int dimension = scanner.nextInt();
        scanner.nextLine();

        int[] inputArray = getInputArray(dimension);
        System.out.println("Eingabe-Array: " + Arrays.toString(inputArray));

        int[] sortedArray = sortArray(inputArray);
        System.out.println("Sortiertes-Array (desc): " + Arrays.toString(sortedArray));

        int[] reversedArray = reversedArray(inputArray);
        System.out.println("Umgekehrtes-Array: " + Arrays.toString(reversedArray));

        System.out.println("Die kleinste Zahl im Array ist: " + findMin(inputArray));

    }


    private static int[] getInputArray(int dimension) {
        int[] inputArray = new int[dimension];
        System.out.println("Geben Sie " + dimension + " ganze Zahlen ein \r");

        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = scanner.nextInt();
        }
        return inputArray;
    }


    private static int[] sortArray(int[] array) {

        int[] sortedArray = Arrays.copyOf(array, array.length);

        boolean flag = true;
        int temp;
        while(flag) {
            flag = false;

            for(int i=0; i<sortedArray.length-1; i++) {
                if(sortedArray[i] < sortedArray[i+1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }

        return sortedArray;
    }


    private static int[] reversedArray(int[] array) {

        int[] reversedArray = Arrays.copyOf(array, array.length);

        int maxIndex = reversedArray.length-1;
        int halfIndex = reversedArray.length / 2;

        for(int i = 0; i < halfIndex; i++){
            int temp = reversedArray[i];
            reversedArray[i] = reversedArray[maxIndex - i];
            reversedArray[maxIndex - i] = temp;
        }

        return reversedArray;
    }


    private static int findMin(int[] array) {

        int min = Integer.MAX_VALUE;

        for(int i=0; i<array.length; i++) {
            int value = array[i];

            if(value < min) {
                min = value;
            }
        }

        return min;
    }




}
