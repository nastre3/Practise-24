package banks;

public class GreenBank implements CountingMachine {
    @Override
    public int result(Money[] monies) {
        int result = 0; // сумма монет
        System.out.println("Green bank counts money...");
        for (int i = 0; i < monies.length; i++) {
            Money currentMoney = monies[i]; // эл-т массива монет
            currentMoney.getCount();
            int rating = currentMoney.getRating();
            int count = currentMoney.getCount();
            int score = rating*count;
            result += score;
        }
        return result;
    }
}
