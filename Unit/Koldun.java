package Unit;

public class Koldun extends Hero {

    public Koldun(String name) {
        super(9, 30, 5, 0, 17, 12, 0, 0);
        super.name = name;
    }

    @Override
    public String getInfo() {
        return "Я Колдун!";
    }

}
