
# FRQ #2 Practice

The following code can be found in [Calculus.java](./Calculus.java) file. Read through the comments and examples below.

A mathematician wants to approximate the area formed by the curve and the axes from his graphs. To do so, he will have 2 list of numbers, one of which is the x values and the other list contains the corresponding y values. The two lists have the same count of numbers. One way to calculate the area is called the left riemann sum which divides the the graph into sections and approximate the area by drawing rectangles to the height of every left point on the graph. The second method is called the right riemann sum which does the same thing except that every rectangle is drawn from the right side of the graph. Finally, he figures out the actual area and wants to compare this actual value to the average of the result of the two methods.

```java
class Calculus {

    //constructor not shown

    //Part A leftSum
    //Returns the area by adding the product of the corresponding y value of the very first x value in every subgroup times by
    //the difference in x value between the first x and last x value in the subgroup.
    //Assume that the list of x-values is strictly ascending.
    //Precondition : x and y have equal lengths, x.length - 1 is divisible by subdiv
    //Param x : the list of x values
    //Param y : the list of y values with respect to each x value
    //Param subdiv : the number of subdivisions, dividing the x values into subgroups
    public double leftSum(int[] x, double[] y, int subdiv){
        // write your code
    }

    //Part B rightSum
    //Returns the area by adding the product of corresponding y value of the last x value in every subgroup times by the
    //difference in x value between the first x and last x value in the subgroup.
    //Assume that the list of x-values is strictly ascending.
    //Precondition : x and y have equal lengths, x.length - 1 is divisible by subdiv
    //Param x : the list of x values
    //Param y : the list of y values with respect to each x value
    //Param subdiv : the number of subdivisions, dividing the x values into subgroups
    public double rightSum(int[] x, double[] y, int subdiv){
        // write your code
    }

    //Part C verifySum
    //Returns -1 when the average of the two sum outputs is less than the actual area
    //Returns 0 when the average of the two sum outputs is equal to the actual area
    //Returns 1 when the average of the two sum outputs is greater than the actual area
    //Precondition : x and y have equal lengths, x.length - 1 is divisible by subdiv
    //Param x : the list of x values
    //Param y : the list of y values with respect to each x value
    //Param subdiv : the number of subdivisions, dividing the x values into subgroups
    //Param area : the actual area of the curve to which will be compared against
    public int verifySum(int[] x, double[] y, int subdiv, double area){
        // write your code
    }

}
```

## Part A leftSum

The left riemann sum finds the sum of the area of rectangles with heights corresponding to the very left coordinate's y value.

```java
    //Part A leftSum
    //Returns the area by adding the product of the corresponding y value of the very first x value in every subgroup times by
    //the difference in x value between the first x and last x value in the subgroup.
    //Assume that the list of x-values is strictly ascending.
    //Precondition : x and y have equal lengths, x.length - 1 is divisible by subdiv
    //Param x : the list of x values
    //Param y : the list of y values with respect to each x value
    //Param subdiv : the number of subdivisions, dividing the x values into subgroups
    public double leftSum(int[] x, double[] y, int subdiv){
        // write your code
    }
```

For example :

| x values      | y values      | subdiv  | divided x groups    | divided y groups  | first y values times change in x| Return|
|:-------------:| :------------:| :-----: |   :------:          | :-----:           | :----:|  :----- |
|1,3,4,5,7      | 2,3,-4,5,8        | 2 | (1,3,4) and (4,5,7)   | (2,3,-4) and (-4,5,8) |   `2*3 + -4*3` | -6.0|
|3,4,5,6,8,12,14| 1,10,20,4,6,-10,15| 3 | (3,4,5), (5,6,8) and (8,12,14) | (1,10,20), (20,4,6) and (6,-10,15) |`1*2 + 20*3 + 6*6` | 98.0|


## Part B rightSum

The right riemann sum finds the sum of the area of rectangles with heights corresponding to the last coordinate's y value.

```java
    //Part B rightSum
    //Returns the area by adding the product of corresponding y value of the last x value in every subgroup times by the
    //difference in x value between the first x and last x value in the subgroup.
    //Assume that the list of x-values is strictly ascending.
    //Precondition : x and y have equal lengths, x.length - 1 is divisible by subdiv
    //Param x : the list of x values
    //Param y : the list of y values with respect to each x value
    //Param subdiv : the number of subdivisions, dividing the x values into subgroups
    public double rightSum(int[] x, double[] y, int subdiv){
        // write your code
    }
```

For example : (with the same values as the previous example)

| x values      | y values      | subdiv  | divided x groups    | divided y groups  | last y values times change in x| Return|
|:-------------:| :------------:| :-----: |   :------:          | :-----:           | :----:|  :----- |
|1,3,4,5,7      | 2,3,-4,5,8        | 2 | (1,3,4) and (4,5,7)   | (2,3,-4) and (-4,5,8) |   `-4*3 + 8*3` | 12.0|
|3,4,5,6,8,12,14| 1,10,20,4,6,-10,15| 3 | (3,4,5), (5,6,8) and (8,12,14) | (1,10,20), (20,4,6) and (6,-10,15) |`20*2 + 6*3 + 15*6` | 148.0|


## Part C verifySum

This method compares the actual area to the average of the areas computed by left sum and right sum.
**You must use leftSum() and rightSum() methods correctly to get full credit, regardless of your answer in Part A and B. Assume that the methods work as intended.**

```java
    //Part C verifySum
    //Returns -1 when the average of the two sum outputs is less than the actual area
    //Returns 0 when the average of the two sum outputs is equal to the actual area
    //Returns 1 when the average of the two sum outputs is greater than the actual area
    //Precondition : x and y have equal lengths, x.length - 1 is divisible by subdiv
    //Param x : the list of x values
    //Param y : the list of y values with respect to each x value
    //Param subdiv : the number of subdivisions, dividing the x values into subgroups
    //Param area : the actual area of the curve to which will be compared against
    public int verifySum(int[] x, double[] y, int subdiv, double area){
        // write your code
    }
```
