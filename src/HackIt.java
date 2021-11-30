import anotherfirm.HiddenClass;

public class HackIt {
    public static void main(String[] args) {
        class Hack extends HiddenClass {
            public void hack() {
                getSecret();
            }
        }
        (new Hack()).hack();
    }
}
