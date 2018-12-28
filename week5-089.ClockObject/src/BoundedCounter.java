
public class BoundedCounter {
    private int counter;
    private int upperBound;

    public BoundedCounter(int counter, int upperBound) {
        this.counter = counter;
        this.upperBound = upperBound;
    }

    public void next() {
        // 23:59:59
        if(this.counter + 1 > this.upperBound) this.counter = 0;
        else this.counter++;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int value) {
        if(value >= 0 && value <= this.upperBound) this.counter = value;
    }

    public String toString() {
        if(this.counter < 10) return "0" + this.counter;
        else return "" + this.counter;
    }
}
