package banks;

public class Money {
    private int count; // число монет
    private int rating; // номинал монеты
    private int currency; // валюта

    public Money(int count, int rating) {
        this.count = count;
        this.rating = rating;
    }

    public int getCount() {
        return count;
    }

    public int getRating() {
        return rating;
    }
}
