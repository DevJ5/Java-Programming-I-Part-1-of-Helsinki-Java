public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    public int differenceInYears(MyDate comparedDate) {
        // Only shows a full year. So... 14-02-2001 and 10-02-2002
        int years = 0;

        // 14-02-2001 < 10-02-2002
        // 14-03-2001 < 10-02-2002
        if(this.year < comparedDate.year) {
            years = comparedDate.year - this.year;
            if(this.month == comparedDate.month && this.day > comparedDate.day) years--;
            else if(this.month > comparedDate.month) years--;
        }

        // 14-02-2002 > 14-02-2001
        // 14-02-2002 > 15-02-2001
        // 14-01-2002 > 15-02-2001
        if(this.year > comparedDate.year) {
            years = this.year - comparedDate.year;
            if(this.month == comparedDate.month && this.day < comparedDate.day) years--;
            else if(this.month < comparedDate.month) years--;
        }

        return years;
    }

}
