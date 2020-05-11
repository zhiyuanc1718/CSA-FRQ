class Calculus {

    //constructor not shown

    //Part A leftSum
    //Returns the area by adding the product of the corresponding y value of the very first x value in every subgroup times by the difference in x value between the first x and last x value in the subgroup. Assume that the list of x-values is strictly ascending.
    //Precondition : x and y have equal lengths, x.length is divisible by subdiv
    //Param x : the list of x values
    //Param y : the list of y values with respect to each x value
    //Param subdiv : the number of subdivisions, dividing the x values into subgroups
    public double leftSum(int[] x, double[] y, int subdiv){
        // write your code
    }

    //Part B rightSum
    //Returns the area by adding the product of corresponding y value of the last x value in every subgroup times by the difference in x value between the first x and last x value in the subgroup. Assume that the list of x-values is strictly ascending.
    //Precondition : x and y have equal lengths, x.length is divisible by subdiv
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
    //Precondition : x and y have equal lengths, x.length is divisible by subdiv
    //Param x : the list of x values
    //Param y : the list of y values with respect to each x value
    //Param subdiv : the number of subdivisions, dividing the x values into subgroups
    //Param area : the actual area of the curve to which will be compared against
    public int verifySum(int[] x, double[] y, int subdiv, double area){
        // write your code
    }

}