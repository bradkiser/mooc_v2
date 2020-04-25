package weekFive.Exercise091;

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
        // first we'll compare years
        if (this.year < compared.year) {
            return true;
        }

        // if the years are the same, we'll compare the months
        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        // years and months the same, we'll compare the days
        if (this.year == compared.year && this.month == compared.month &&
                this.day < compared.day) {
            return true;
        }

        return false;
    }

    public void advance() {
        this.day++;

        if (this.day > 30) {
            this.day = 1;
            this.month++;
            if (this.month > 12) {
                this.year++;
                this.month = 1;
            }
        }
    }

    public void advance(int amountOfDays) {
        int i = 0;

        while (i < amountOfDays) {
            advance();
            i++;
        }
    }

    public MyDate afterNumberOfDays(int days) {
        MyDate newDate = new MyDate(this.day, this.month, this.year);
        newDate.advance(days);
        return newDate;
    }

    public int differenceInYears(MyDate compared) {
        int diff;

        if (!earlier(compared)) {
            diff = this.year - compared.year;

            if (this.month < compared.month) {
                return diff - 1;
            } else if (this.month == compared.month) {
                return this.day < compared.day ? diff - 1 : diff;
            }
        } else {
            diff = compared.year - this.year;

            if (compared.month < this.month) {
                return diff - 1;
            } else if (compared.month == this.month) {
                return compared.day < this.day ? diff - 1 : diff;
            }
        }
        return diff;
    }
}
