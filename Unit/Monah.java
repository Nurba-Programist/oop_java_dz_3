package Unit;

public class Monah extends Hero {

    public Monah(String name) {
        super(5, 30, 4, 0, 12, 7, 1, 0);
        super.name = name;
    }

    @Override
    public String getInfo() {
        return "Я Монах!";
    }

}
