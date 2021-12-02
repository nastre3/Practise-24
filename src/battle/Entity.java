package battle;

abstract public class Entity {
    protected String name;
    private int hp = 15;
    private boolean destroyed = false;

    public Entity(String name) {
        this.name = name;
    }

    public boolean isDestroyed(){
        return destroyed;
    }

    protected boolean damage(int dhp){
        hp -= dhp;
        if (hp < 0){
            destroyed = true;
            System.out.println("Monster " + name + " was destroyed");
            return true;
        }
        return false;
    }
}
