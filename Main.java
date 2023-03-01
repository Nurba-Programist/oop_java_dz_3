import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import Unit.Arbaletchik;
import Unit.Hero;
import Unit.Koldun;
import Unit.Kopeishik;
import Unit.Krestyanin;
import Unit.Monah;
import Unit.Razboinik;
import Unit.Sniper;

public class Main {

    public static void main(String[] args) {

        ArrayList<Hero> heros = new ArrayList<>();
        heros.add(new Krestyanin("Крестьянин"));
        heros.add(new Razboinik("Разбойник"));
        heros.add(new Sniper("Снайпер"));
        heros.add(new Koldun("Колдун"));

        ArrayList<Hero> heros2 = new ArrayList<>();
        heros2.add(new Krestyanin("Крестьянин"));
        heros2.add(new Kopeishik("Копейщик"));
        heros2.add(new Arbaletchik("Арбалетчик"));
        heros2.add(new Monah("Монах"));

        System.out.println("\nПервая команда: ");
        System.out.println(heros);
        System.out.println("\nВторая команда: ");
        System.out.println(heros2);

        System.out.println("\nВсе герои: ");

        heros.addAll(heros2);
        Collections.sort(heros, new Comparator<Hero>() {
            @Override
            public int compare(Hero o1, Hero o2) {
                return o1.getPrice() - o2.getPrice();
            }
        });
        System.out.println(heros);
        System.out.println("\n");

        Collections.sort(heros, new Comparator<Hero>() {
            @Override
            public int compare(Hero o1, Hero o2) {
                return o1.getPrice() - o2.getPrice();
            }
        });
        Collections.sort(heros2, new Comparator<Hero>() {
            @Override
            public int compare(Hero o1, Hero o2) {
                return o1.getPrice() - o2.getPrice();
            }
        });

    }

}