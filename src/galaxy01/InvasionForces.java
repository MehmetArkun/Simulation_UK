package galaxy01;

public class InvasionForces {

    public String unit;
    public String weaponType;
    public String defenseUtilities;

    public void attack(){
        System.out.println(unit + " units are attacking with " + weaponType);
    }

    public void defend(){
        System.out.println(unit + " units have activated " + defenseUtilities);
    }

    public InvasionForces(String unit, String weaponType, String defenseUtilities) {
        this.unit = unit;
        this.weaponType = weaponType;
        this.defenseUtilities = defenseUtilities;
    }

    public String toString() {
        return "InvasionForces{" +
                "unit='" + unit + '\'' +
                ", weaponType='" + weaponType + '\'' +
                ", defenseUtilities='" + defenseUtilities + '\'' +
                '}';
    }
}
