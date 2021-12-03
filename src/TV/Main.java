package TV;

class TVset{

    int channel = 5;
    boolean isOn;

    public String toString(){
        if (!isOn){
            return "The TVset is OFF";
        }
        return "Channel " + channel + " is on the TVset now.";
    }
}

class Remote{

    private TVset tvSet;

    public void setTVset(TVset tvSet){
        this.tvSet = tvSet;
    }
    public void setChannel(int channel){
        tvSet.channel = channel;
    }
    public void turnOn(){
        tvSet.isOn = true;
    }
    public void turnOff(){
        tvSet.isOn = false;
    }
}


public class Main {

    public static void main(String[] args) {

        TVset tv = new TVset();
        Remote remote = new Remote();
        remote.setTVset(tv);
        System.out.println(tv);
        remote.turnOn();
        System.out.println(tv);
        remote.setChannel(2);
        System.out.println(tv);
        remote.turnOff();
        System.out.println(tv);

    }
}
