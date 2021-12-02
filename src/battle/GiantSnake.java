package battle;

public class GiantSnake extends Monster {
    public static String scream = "Ssssss";

    public GiantSnake(String name) {
        super(name + " the GiantSnake", 5);
    }


    public void growl(){
        System.out.println(scream);
    }

    public void attack(Entity m){
        growl();
    }

    @Override
    public void attack(Monster monster) {

    }
}
