package battle;

/*Добавлять нужно до пяти монстров (далее следует отказ) методом void start(),
который запускает метод void run(), который в свою очередь работает так:
запускает метод attack() для каждого из монстров по порядку добавления по одному разу.
 */

public class Battle {
    final static private int MAX = 5;
    private Monster[] monsters;
    private int n = 0;

    Battle() {
        monsters = new Monster[MAX];
    }

    public void add(Monster monster) {
        if (n < MAX) {
            monsters[n++] = monster;
        } else {
            System.out.println("No more monsters!");
        }
    }

    public void run() {
        for (Monster a : monsters) {
            if (a != null) {
                a.attack();
            }
        }
    }

    public void start() {
        run();
    }


}
