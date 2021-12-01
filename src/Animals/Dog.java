package Animals;

public class Dog extends Mammal {
    public void print(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "I am a Dog";
    }
//...
}
