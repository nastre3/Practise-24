package battle;

public class Monster {
    // Все монстры имеют собственное имя, обладают здоровьем, разрушительной силой и умеют атаковать и издавать устрашающие звуки.
    public Monster(String name, int damage) {
        System.out.println("Monster " + name + " was created.");
    }

    // Метод, который выводит рёв монстра
    public void growl() {
    }

    // Метод, который выводит информацию о силе разрушения, которое наносит монстр
    public void attack() {
        System.out.println("Monster attacked with damage 5");
    }
}
