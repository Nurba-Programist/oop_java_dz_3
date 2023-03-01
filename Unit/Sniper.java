package Unit;

public class Sniper extends Archer {

    public Sniper(String name) {
        super(9, 15, 8, 10, 12, 10, 32);
        super.name = name;
    }

    @Override
    public void step(int a) {

    }

    @Override
    public String getInfo() {
        return "Я Снайпер!";
    }
}
