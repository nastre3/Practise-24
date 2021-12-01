package battle;

public class Task24_2_4 {
    public static void main(String[] args) {
        /*

Make class Monster abstract
Fix class Zobie and ...

*/

        Battle battle = new Battle();
        battle.add(new Zombie("Alice"));
        battle.add(new Zombie("Bob"));
        battle.add(new Zombie("Eve"));
        battle.add(new GiantSnake("Kaa"));
        battle.add(new GiantSnake("Son of Kaa"));

        battle.start();


/*

                       ...and The Battle starts!

*/
    }
}
