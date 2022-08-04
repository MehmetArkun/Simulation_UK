package galaxy01;

public class PlanetX {
    public PlanetX() {
        System.out.println("Contacted to her Majesty Queen El II");
    }
    public final void invade(){
        System.out.println("Invasion of Planet X");
    }


    public static void main(String[] args) {
        PlanetX planet = new PlanetX();
        planet.invade();



    }
}
