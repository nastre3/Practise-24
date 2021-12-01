package Animals;

public class Test {
    public static void main(String args[]) {
    /*
        Animal c = new Cat();
        Animal r = new Reptile();
        Animal d = new Dog();

        System.out.println(c instanceof Animal);
        System.out.println(r instanceof Mammal);
        System.out.println(d instanceof Dog);
        d.print();

        Zoo zoo = new Zoo();
        zoo.change(new PopcornStall(), 1);
        zoo.print();
*/
        Zoo zoo = new Zoo();
        zoo.change(new Reptile(), 2);
        System.out.println(zoo);
        zoo.sound();
    }
}
