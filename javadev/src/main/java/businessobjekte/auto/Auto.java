package businessobjekte.auto;

/**
 * Klasse beschreibt Eigenschaften und  Funktionen eines Autos
 */

public class Auto {

    private String farbe;
    private Integer baujahr;
    private Integer ps;

    public Auto() {
        initialsiereAuto();
    }

    private void initialsiereAuto() {

        this.farbe = "weiss";
        this.baujahr = 2000;
        this.ps = 90;

        System.out.println("");
        System.out.println("------------------------------------------------------------");
        System.out.println("Dies ist die Methode starteAuto");
        System.out.println("------------------------------------------------------------");
        System.out.println("Mein Auto hat die Farbe " + this.getFarbe());
        System.out.println("Mein Auto hat das Baujahr " + this.getBaujahr());
        System.out.println("Mein Auto hat " + this.getPs() + " PS");
        System.out.println("Mein Auto hupt jetzt: ");
        hupen();
        System.out.println("");
    }


    public void hupen() {
        System.out.println("hup, hup, hup, ...");
    }

    public String getFarbe() {
        return farbe;
    }

    public Integer getBaujahr() {
        return baujahr;
    }

    public void setBaujahr(Integer baujahr) {
        this.baujahr = baujahr;
    }

    public void setPs(Integer ps) {
        this.ps = ps;
    }

    public void lackieren(String farbe) {
        this.farbe = farbe;

    }

    public Integer getPs() {
        return ps;
    }


    @Override
    public int hashCode() {
        return farbe.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Auto)) return false;

        Auto auto = (Auto) o;
        //Dadurch werden zwei Autoas als equal defiiert, wenn sie die gleiche Farbe haben
        return farbe != null ? farbe.equals(auto.farbe) : auto.farbe == null;
    }
}
