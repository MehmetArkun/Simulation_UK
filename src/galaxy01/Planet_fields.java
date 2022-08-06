package galaxy01;

public class Planet_fields {
    public String name;
    public long distanceFromEarth;
    public boolean isAtmosphere;
    public boolean isWater;
    public boolean isLife;

    public Planet_fields(String name, long distanceFromEarth, boolean isAtmosphere, boolean isWater, boolean isLife) {
        this.name = name;
        this.distanceFromEarth = distanceFromEarth;
        this.isAtmosphere = isAtmosphere;
        this.isWater = isWater;
        this.isLife = isLife;
    }

    @Override
    public String toString() {
        return "Planet_fields{" +
                "name='" + name + '\'' +
                ", distanceFromEarth=" + distanceFromEarth +
                ", isAtmosphere=" + isAtmosphere +
                ", isWater=" + isWater +
                ", isLife=" + isLife +
                '}';
    }
}
