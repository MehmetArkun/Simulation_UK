package galaxy01;

public class EmpireStrikesBack {

    public static void main(String[] args) {
        System.out.println("The invasion has started");

        StormTroopers stormTroopersUnit1 = new StormTroopers("Stormtroopers","Laser Rifle", "Magnetic Shield");
        stormTroopersUnit1.attack();

        StarDestroyer starDestroyerFrigate1 = new StarDestroyer("Star Destroyer Frigate", "Quantum Beams", "Hyper Shield");
        starDestroyerFrigate1.attack();

    }
}
