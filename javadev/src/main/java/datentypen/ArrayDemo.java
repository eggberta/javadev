package datentypen;

import businessobjekte.auto.Auto;

public class ArrayDemo {


    public static void main(String[] args) {
        demoIntArray();
        demoAutoArray();
        demoZweidimensionalesArray();
    }

    private static void demoZweidimensionalesArray() {

        int dimension1 = 3;
        int dimension2 = 5;
        int[][] matrix = new int[dimension1][dimension2];
        matrix[0][0] = 100;
        matrix[0][1] = 101;
        matrix[0][2] = 102;
        matrix[2][2] = 122;
        matrix[2][4] = 124;
        matrix[2][2] = 122;

        for (int i = 0; i < dimension1; i++) {
            for (int j = 0; j < dimension2; j++) {
                System.out.println(matrix[i][j]);
            }
        }

    }

    private static void demoAutoArray() {
        int arrayGroesse = 10;
        Auto[] vieleAutos = new Auto[arrayGroesse];

        System.out.println("Größe des Arrays: " + vieleAutos.length);
        vieleAutos[0] = new Auto();
        vieleAutos[1] = new Auto();
        vieleAutos[2] = new Auto();
        vieleAutos[3] = new Auto();
        vieleAutos[4] = new Auto();

        for (int i = 0; i < vieleAutos.length; i++) {
            Auto aktuellesAuto = vieleAutos[i];
            if (aktuellesAuto != null) {
                System.out.println("businessobjekte/auto " + (i + 1) + " wurde im Jahr " + vieleAutos[i].getBaujahr()
                        + " erbaut, hat die Farbe " + vieleAutos[i].getFarbe()
                        + " und hat " + vieleAutos[i].getPs() + " PS");
            }

        }
    }

    private static void demoIntArray() {
        int arrayGroesse = 10;
        int[] vieleZahlen = new int[arrayGroesse];
        System.out.println("Größe des Arrays: " + vieleZahlen.length);
        vieleZahlen[0] = 1;
        vieleZahlen[1] = 2;
        vieleZahlen[2] = 3;
        vieleZahlen[3] = 4;
        vieleZahlen[8] = vieleZahlen[1];

        for (int i = 0; i < vieleZahlen.length; i++) {
            System.out.println(vieleZahlen[i]);
        }
    }


    private static void ausgabeDerEingabeParameter(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }

}
