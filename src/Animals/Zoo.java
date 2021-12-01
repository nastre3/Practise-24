package Animals;

import java.util.Arrays;

public class Zoo {
    Object[] animals;
    public Zoo(){
        // в этой строке мы еще не создаем животных
        animals = new Object[3];
        // наполняем массив конкретными животными
        animals[0] = new Dog();
        animals[1] = new Cat();
        animals[2] = new Reptile();
    }
    public void print(){
        // Используем цикл!
        // Каждое животное выводится по-своему!
        for( Object a: animals){
            System.out.println(a);
        }
    }

    public void sound(){
        for(Object a: animals){
            if (a instanceof Soundable) { // проверка реализации интерфейса Soundable
                ((Soundable)a).sound(); // приведение к Soundable
            }
        }
    }

    public void change(Object a, int i){
        if (i >= 0 && i < animals.length)
            animals[i] = a;
    }

    @Override
    public String toString() {
        return "Zoo: " + Arrays.toString(animals);
    }
}
