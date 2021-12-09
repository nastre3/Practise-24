package banks;

public class GreenBank extends CentralBank implements CountingMachine {
    @Override
    public int result(Money[] monies) {
        int result = 0; // сумма монет
        System.out.println("Green bank converts money...");
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

    @Override
    public void convertToRubles(Money[] monies) {
        double resultUSD = 0; // сумма монет в USD
        double resultEUR = 0; // сумма монет в EUR
        System.out.println("Green bank counts money...");
        for (int i = 0; i < monies.length; i++) {
            Money currentMoney = monies[i]; // эл-т массива монет
            currentMoney.getCount();
            int rating = currentMoney.getRating();
            int count = currentMoney.getCount();
            double scoreUSD = rating*count*currencyRateUSDtoRUB;
            double scoreEUR = rating*count*currencyRateEURtoRUB;
            resultUSD += scoreUSD;
            resultEUR += scoreEUR;
        }
        System.out.println("Result in USD: " + resultUSD);
        System.out.println("Result in EUR: " + resultEUR);
    }
}
