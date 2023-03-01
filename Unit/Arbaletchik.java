package Unit;

public class Arbaletchik extends Archer {

    public Arbaletchik(String name) {
        super(4, 10, 2, 3, 6, 3, 16);
        super.name = name;
    };

    @Override
    public String getInfo() {
        return "Я Арбалетчик!";
    }
}
