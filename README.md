
# FRQ Practice

```java
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
    public double averageTimeDifference(){
        //write your code
    }
}
```

## Part A

```java
    //Part A compareTime method
    //Returns 1 if time is after the other time
    //Returns 0 if two times are equivalent
    //Returns -1 if time is before the other time
    public int compareTime(Time other){
        // write your code
    }
```

Examples : A compare against B

| Time A        | Time B        | Return|
|:-------------:| :------------:|:-----:|
|11:20          | 14:45         | -1    |
| 10:34         | 9:59          |   1   |
| 10:00         | 10:00         |    0  |

## Part B

This method returns the minutes since 12 AM (0:00)

```java
    //Part B getMinutes method
    //Returns the number of minutes since the beginning of the day
    public int getMinutes(){
        // write your code
    }
```

Examples :

| Time A        | getMinutes()  |
|:-------------:| :------------:|
|5:00           | 300           |
| 9:32          | 572           |
| 11:59         | 719           |

## Part C

This method checks whether a list of Time objects are in ascending order.

```java
    private ArrayList<Time> times;

    //constructor not shown

    //assume for the following that times is instantiated and has at least a pair of time

    //Part C ascending method
    //Returns true if all time in times are placed in ascending order
    //Returns false otherwise
    public boolean ascending(){
        //write your code
    }
```

Examples :

| list of times         | Return        |
|:-------------:        | :------------:|
|2:30, 3:20, 3:49, 4:34 | true          |
|1:32, 2:22, 2:15, 9:45 | false         |

## Part D

This method will return the average difference (in minutes) between each consecutive pair of time.

```java
    //Part D averageTimeDifference method
    //Returns the average time difference of all consecutive time pairs
    public double averageTimeDifference(){
        //write your code
    }
```

Examples :

| list of times         | Return        |
|:-------------:        | :------------:|
|2:30, 3:20, 3:49, 4:34 | 41.333333...  |
|1:32, 2:22, 2:15, 9:45 | 169.0         |
