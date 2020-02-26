package app;

public class Dollar {
    Dollar(final int amount) {
        this.amount = amount;
    }

    Dollar times(final int multiplier) {
        return new Dollar(amount * multiplier);
    }

    int amount;
}