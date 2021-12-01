package battle;

public class Task24_2_4 {
    public static void main(String[] args) {
        Battle battle = new Battle();
        battle.add(new Zombie("Alice"));
        battle.add(new Zombie("Bob"));
        battle.add(new Zombie("Eve"));
        battle.add(new GiantSnake("Kaa"));
        battle.add(new GiantSnake("Son of Kaa"));

        battle.add(new Zombie("Noname"));
        battle.add(new GiantSnake("Noname"));

        battle.start();
        /*
        Battle battle = new Battle();
        battle.add(new Zombie("Alice"));
        battle.add(new Zombie("Bob"));
        battle.start();


        Monster Alice the Zombie was created
        Monster Bob the Zombie was created
        Monster Alice the Zombie attacked with damage 5
        Raaaauuughhhh Alice the Zombie growled
        Monster Bob the Zombie attacked with damage 5
        Raaaauuughhhh Bob the Zombie growled
         */
    }
}
