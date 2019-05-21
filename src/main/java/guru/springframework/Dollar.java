package guru.springframework;

public class Dollar {
    private int amount;

    public Dollar(int amount) {
        this.amount = amount;
    }

    public Dollar times(int multiplier){
        return new Dollar(amount * multiplier);

    }

    public int getAmount() {
        return amount;
    }

    public boolean equals(Object object) {
        if (object == null) {
            return false;
        } else if (object.getClass() != this.getClass()) {
            return false;
        }

        Dollar other = (Dollar) object;
        if (amount == other.getAmount()) {
            return true;
        }
        return false;
    }
}
