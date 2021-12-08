package battle;

public class Player extends Human {
    public Backpack backpack;

    public Player(String name) {
        super(name + " the Player");
        backpack = new Backpack();
    }

    public void take(String smth) {
        backpack.put(smth);
    }

    class Backpack{
        private String myList = "";

        void put(String thing){
            myList += thing +",";
        }
        public String toString(){
            if (myList.equals("")) {
                return "the backpack is empty";
            }
            return myList.substring(0, myList.length()-1) + " in the backpack";
        }
    }
}
