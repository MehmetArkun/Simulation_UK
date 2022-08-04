package galaxy01;

public class StormTroopers extends InvasionForces{


    public StormTroopers(String unit, String weaponType, String defenseUtilities) {
        super(unit, weaponType, defenseUtilities);
    }

    @Override
    public String toString() {
        return "StormTroopers{" +
                "unit='" + unit + '\'' +
                ", weaponType='" + weaponType + '\'' +
                ", defenseUtilities='" + defenseUtilities + '\'' +
                '}';
    }
}
