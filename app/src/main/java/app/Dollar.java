package app;

public class Dollar {
    Dollar(final int amount) {
        this.amount = amount;
    }

    void times(final int multiplier) {
        amount = amount * multiplier;
    }

    int amount;
}