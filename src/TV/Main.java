package TV;

class TVset{

    private int channel = 5;
    private boolean isOn;
    private Remote remote = new Remote();

    public Remote getRemote(){
        return remote;
    }

    class Remote{

        public void setChannel(int channel){
            TVset.this.channel = channel; // обращение к переменной внешнего класса с помощью констуркции Outerclass.this
        }
        public void turnOn(){
            isOn = true;
        }
        public void turnOff(){
            isOn = false;
        }
    }

    public String toString(){
        if (!isOn){
            return "The TVset is OFF";
        }
        return "Channel " + channel + " is on the TVset now.";
    }
}

public class Main {

    public static void main(String[] args) {
        TVset tv = new TVset(); // покупаем телевизор
        TVset.Remote remote = tv.getRemote(); // и берем из коробки новенький пульт (он входит в комплект!) - создаем объект внутр. класса конструкцией outerObject.new InnerClass().
        System.out.println(tv);
        remote.turnOn(); // и сразу начинаем пользоваться
        System.out.println(tv);
        remote.setChannel(2);
        System.out.println(tv);
        remote.turnOff();
        System.out.println(tv);

    }
}

