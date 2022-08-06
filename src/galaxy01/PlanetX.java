package galaxy01;

public class PlanetX {

    private String troopName;

    public PlanetX(String troopName) {
        this.troopName = troopName;
    }

    public String getTroopName() {
        return troopName;
    }

    public void setTroopName(String troopName) {
        // add a condition in here
        this.troopName = troopName;
    }

    public PlanetX() {
        System.out.println("Contacted to her Majesty Queen El II");
    }
    public final void invade(){
        System.out.println("Invasion of Planet X");
    }

    @Override
    public String toString() {
        return "PlanetX{}";
    }

    public static void main(String[] args) {
        PlanetX planet = new PlanetX();
        planet.invade();

    }
}
