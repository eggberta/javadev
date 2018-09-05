package konzepte;

import businessobjekte.auto.Auto;

public class EqualsDemo {
    public EqualsDemo() {

        System.out.println("");
        System.out.println("---------------------------------------------------------");
        System.out.println("Equals Demo");
        System.out.println("---------------------------------------------------------");

        Auto auto1 = new Auto();
        Auto auto2 = new Auto();

        // Die equals-Methode wurde in der Klasse Auto überschrieben
        if (auto1.equals(auto2)){
            System.out.println("Beim Vergleich mit equals sind die Autos  gleichwertig");
        } else {
            System.out.println("Beim Vergleich mit equals sind die Autos  nicht gleichwertig");
        }
    }
}
