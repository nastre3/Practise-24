package Animals;

public class Cat extends Mammal {
    public void print(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "I am an Cat";
    }
//...
}
