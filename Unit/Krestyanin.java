package Unit;

public class Krestyanin extends Hero {

    public Krestyanin(String name) {
        super(3, 1, 1, 0, 1, 1, 0, 1);
        super.name = name;

    }

    @Override
    public String getInfo() {
        return "Я Крестьянин!";
    }
}
