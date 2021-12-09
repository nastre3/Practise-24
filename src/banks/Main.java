package banks;

public class Main {
    public static void main(String[] args) {
        Money[] monies = new Money[5];
        monies[0] = new Money(10,5);
        monies[1] = new Money(5,10);
        monies[2] = new Money(100,1);
        monies[3] = new Money(50,2);
        monies[4] = new Money(80,1000);

        CountingMachine greenBank = new GreenBank();
        CountingMachine blueBank = new BlueBank();

        int result = greenBank.result(monies);
        System.out.println("You have a lot of money in RUB: " + result);
        greenBank.convertToRubles(monies);

        int result2 = blueBank.result(monies);
        System.out.println("You have a lot of money in RUB: " + result2);
        blueBank.convertToRubles(monies);
    }
}
