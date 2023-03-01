package Unit;

public abstract class Archer extends Hero {

    int shots;

    public Archer(int speed, int hp, int damage, int maxDamage, int att, int def, int shots) {
        super(speed, hp, damage, maxDamage, att, def, maxDamage, def);
        this.shots = shots;
    }

}
