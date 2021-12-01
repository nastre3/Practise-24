package battle;

public abstract class Monster {
    int hp = 15;
    int force;
    private String name;
    private boolean destroyed = false;

    // Все монстры имеют собственное имя, обладают здоровьем, разрушительной силой и умеют атаковать и издавать устрашающие звуки.
    public Monster(String name, int force) {
        this.name = name;
        this.force = force;
        System.out.println("Monster " + name + " was created.");
    }

    // Метод, который выводит рёв монстра
    public void growl() {
    }

    // Метод, который выводит информацию о силе разрушения, которое наносит монстр
    public abstract void attack(Monster monster);

    protected boolean damage(int dhp) {
        hp -= dhp;
        if (hp<=0) {
            return true;
        } else return false;
    }

    public boolean isDestroyed() {
        if (hp<=0) {
            return true;
        } else return false;
    }
}
