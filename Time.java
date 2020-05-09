class Time {

    //All time reported within interval 0:00 (new day) to 23:59 (end of day) inclusive
    private int hour;
    private int min;

    //Param : hour and minute
    //Preconditions : 0 <= hour < 24 and 0 <= min < 60
    public Time(int hour, int min){
        this.hour = hour;
        this.min = min;
    }

    //Part A compareTime method
    //Returns 1 if time is after the other time
    //Returns 0 if two times are equivalent
    //Returns -1 if time is before the other time
    public int compareTime(Time other){
        // write your code
    }

    //Part B getMinutes method
    //Returns the number of minutes since the beginning of the day
    public int getMinutes(){
        // write your code
    }

}

class Clock {

    private ArrayList<Time> times;

    //constructor not shown

    //assume for the following that times is instantiated and has at least a pair of time

    //Part C ascending method
    //Returns true if all time in times are placed in ascending order
    //Returns false otherwise
    public boolean ascending(){
        //write your code
    }

    //Part D averageTimeDifference method
    //Returns the average time difference of all consecutive time pairs
    //if times is not ascending, find the difference in minutes between the first and last time in the list
    public double averageTimeDifference(){
        //write your code
    }
}