package Animals;

public class PopcornStall extends Animal implements Soundable {
    public void print() {
        System.out.println("It's Popcorn Stall");
    }

    @Override
    public void sound() {
        System.out.println("Buy popcorn!");
    }
}
