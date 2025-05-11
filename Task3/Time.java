public class Time {
    // Fields for hour, minute, and second
    private int hour;
    private int minute;
    private int second;

    // Constructor to initialize hour, minute, and second
    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // Getter for hour
    public int getHour() {
        return hour;
    }

    // Getter for minute
    public int getMinute() {
        return minute;
    }

    // Getter for second
    public int getSecond() {
        return second;
    }

    // Setter for hour
    public void setHour(int hour) {
        this.hour = hour;
    }

    // Setter for minute
    public void setMinute(int minute) {
        this.minute = minute;
    }

    // Setter for second
    public void setSecond(int second) {
        this.second = second;
    }

    // Set all fields at once
    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // Return time as string in "hh:mm:ss" format with leading zeros
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    // Advance time by one second and return this instance
    public Time nextSecond() {
        second++;
        if (second == 60) {
            second = 0;
            minute++;
            if (minute == 60) {
                minute = 0;
                hour++;
                if (hour == 24) {
                    hour = 0;
                }
            }
        }
        return this;
    }

    // Go back by one second and return this instance
    public Time previousSecond() {
        second--;
        if (second == -1) {
            second = 59;
            minute--;
            if (minute == -1) {
                minute = 59;
                hour--;
                if (hour == -1) {
                    hour = 23;
                }
            }
        }
        return this;
    }
}