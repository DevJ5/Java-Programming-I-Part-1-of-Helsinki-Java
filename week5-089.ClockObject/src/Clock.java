public class Clock {
    private BoundedCounter hours;
    private BoundedCounter minutes;
    private BoundedCounter seconds;

    public Clock(int hoursAtBeginning, int minutesAtBeginning, int secondsAtBeginning) {
        this.hours = new BoundedCounter(hoursAtBeginning, 23);
        this.minutes = new BoundedCounter(minutesAtBeginning, 59);
        this.seconds = new BoundedCounter(secondsAtBeginning, 59);
    }

    public void tick() {
        // Do this every second
        if (this.seconds.getCounter() == 59 && this.minutes.getCounter() == 59) {
            this.minutes.next();
            this.hours.next();
        } else if (this.seconds.getCounter() == 59) this.minutes.next();

        this.seconds.next();


    }

    public String toString() {
        // returns the string representation
        return this.hours + ":" + this.minutes + ":" + this.seconds;
    }
}
