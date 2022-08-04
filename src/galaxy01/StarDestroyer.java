package galaxy01;

public class StarDestroyer extends InvasionForces{

    public StarDestroyer(String unit, String weaponType, String defenseUtilities) {
        super(unit, weaponType, defenseUtilities);
    }

    @Override
    public String toString() {
        return "StarDestroyer{" +
                "unit='" + unit + '\'' +
                ", weaponType='" + weaponType + '\'' +
                ", defenseUtilities='" + defenseUtilities + '\'' +
                '}';
    }
}
