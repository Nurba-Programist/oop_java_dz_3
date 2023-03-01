package Unit;

public class Razboinik extends Hero {

    public Razboinik(String name) {
        super(6, 10, 2, 4, 8, 3, 0, 0);
        super.name = name;
    }

    @Override
    public String getInfo() {
        return "Я Разбойник!";
    }

}
