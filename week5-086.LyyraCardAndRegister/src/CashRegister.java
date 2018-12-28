
public class CashRegister {

    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;

    public CashRegister() {
        this.cashInRegister = 1000;
        this.economicalSold = 0;
        this.gourmetSold = 0;
    }

    public double payEconomical(double cashGiven) {
        // price of the economical lunch is 2.50 euros
        double priceEconomical = 2.50;
        // if the given cash is at least the price of the lunch:
        if(cashGiven >= priceEconomical) {
            cashInRegister += priceEconomical;
            this.economicalSold++;
            return cashGiven - priceEconomical;
        }
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price 
        // if not enough money given, all is returned and nothing else happens
        return cashGiven;
    }

    public boolean payEconomical(LyyraCard card) {
        double priceEconomical = 2.50;
        if(card.pay(priceEconomical)) {
            this.economicalSold++;
            return true;
        }
        return false;
    }

    public double payGourmet(double cashGiven) {
        // price of the gourmet lunch is 4.00 euros
        double priceGourmet = 4.00;
        if(cashGiven >= priceGourmet) {
            this.cashInRegister += priceGourmet;
            this.gourmetSold++;
            return cashGiven -  priceGourmet;
        }
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price 
        // if not enough money given, all is returned and nothing else happens
        return cashGiven;
    }

    public boolean payGourmet(LyyraCard card) {
        double priceGourmet = 4.00;
        if(card.pay(priceGourmet)) {
            this.gourmetSold++;
            return true;
        }

        return false;
    }

    public void loadMoneyToCard(LyyraCard card, double sum) {
        if(sum > 0) {
            card.loadMoney(sum);
            this.cashInRegister += sum;
        }
    }


    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }
}
