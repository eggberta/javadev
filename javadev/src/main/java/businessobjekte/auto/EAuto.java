package businessobjekte.auto;


public class EAuto extends Auto {

    public EAuto() {
    }

    public void bremsen(){
        System.out.println("bremse, bremsn, steht");
    }

    @Override
    public void hupen(){
        System.out.println("tuth, tuth, tuuuuuuuuuuuuth");

    }
}
