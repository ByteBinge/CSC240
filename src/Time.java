
class Time extends Exception {

    // Current time of object
    private int hour;
    private int minute;
    private int second;

    // User can either pass in nothing, or the entire time H:M:S.
    public Time() {
	this(0, 0, 0);
    }

    // Possible improvement: Custom exception for negative numbers, fractional numbers, or numbers exceeding 23 hours, 59 minutes, 59 seconds (upper bounds).
    public Time(int hour, int minute, int second) {
	    this.hour = hour;
	    this.minute = minute;
	    this.second = second;
	}



    public int[] getTime() {
	return new int[] {hour, minute, second};
    }

    public void increment(int seconds) {
	second += seconds;

	if (second > 59) {
	    minute = second / 60;
	    second %= 60;
	}

	if (minute > 59) {
	    hour = minute / 60;
	    minute %= 60;
	}

	if (hour > 23) {
	    hour %= 24;
	}
    }

    // Testing purposes for code using for-loops
    public void setHour(int hour) { this.hour = hour; }
    public void setMinute(int minute) { this.minute = minute; }
    public void setSecond(int second) { this.second = second; }
    
    public String print(boolean military) {
	if (military) {
	    return String.format("%02d:%02d:%02d", hour, minute, second);
	}
	return String.format("%01d:%02d:%02d", hour%12+1, minute, second);
    }
}
