package Unit;

public class Kopeishik extends Hero {

    public Kopeishik(String name) {
        super(4, 10, 1, 3, 4, 5, 0, 0);
        super.name = name;
    }

    @Override
    public String getInfo() {
        return "Я Копейщик!";
    }

}
