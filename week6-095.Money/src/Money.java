
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            // euros = 2
            // cents = 150
            // euros += 150/100, so euros = 2 + 1.5 = 3.5, because int => 3
            euros += cents / 100;
            // cents = cents % 100, so 50
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    public Money plus(Money added) {
        Money newMoney = new Money(this.euros + added.euros, this.cents + added.cents);
        return newMoney;
    }

    public boolean less(Money compared) {
        if(this.euros > compared.euros) return false;
        else if(this.euros == compared.euros && this.cents > compared.cents) return false;
        else return true;
    }

    public Money minus(Money decremented) {
        //  Ex. r1 = 10.00, r2 = 7.40 -> 10.00 - 7.40 = 2.60
            int currentCents = this.euros * 100 + this.cents;
            int decrementedCents = decremented.euros * 100 + decremented.cents();

            int totalCents = currentCents - decrementedCents;
            if(totalCents < 0) return new Money(0,0);

            // 260, 1050, 1500
            int newEuros = totalCents / 100;
            int newCents = totalCents % 100;

            return new Money(newEuros, newCents);

            // 30 40, 00 30

        }

    @Override
    public String toString() {
        // Ex. Output is 10.00e or 10.07e
        String zero = this.cents < 10 ? "0" : "";
        return this.euros + "." + zero + this.cents + "e";
    }

}
