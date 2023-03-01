package Unit;

public abstract class Hero implements GameInterface {

    public int speed, damage, maxDamage, att, def, hp, mag, delivery;
    public String name;

    public Hero(int speed, int hp, int damage, int maxDamage, int att, int def, int mag, int delivery) {
        this.speed = speed;
        this.hp = hp;
        this.damage = damage;
        this.maxDamage = maxDamage;
        this.att = att;
        this.def = def;
        this.mag = mag;
        this.delivery = delivery;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "{" + name + "," + speed + "}";
    }

    public int getPrice() {
        return speed;
    }

    @Override
    public void step(int a) {
    }

    @Override
    public String getInfo() {
        return "Я Герой";
    }
}