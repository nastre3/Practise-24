package Animals;

public class Dog extends Mammal implements Soundable {
    public void print(){
        System.out.println(this);
    }

    @Override
    public void sound() {
        System.out.println("Auf");
    }

    @Override
    public String toString() {
        return "I am a Dog";
    }
//...
}
