package banks;

public interface CountingMachine {
    int result(Money[] monies);
    void convertToRubles(Money[] monies);
}
