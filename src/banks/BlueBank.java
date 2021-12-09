package banks;

public class BlueBank implements CountingMachine {
    @Override
    public int result(Money[] monies) {
        int result = 0; // сумма монет
        int commission = 50; // коммиссия банка
        System.out.println("Blue bank counts money...");
        for (int i = 0; i < monies.length; i++) {
            Money currentMoney = monies[i]; // эл-т массива монет
            currentMoney.getCount();
            int rating = currentMoney.getRating();
            int count = currentMoney.getCount();
            int score = rating*count;
            result += score;
        }
        return result-commission;
    }
}
