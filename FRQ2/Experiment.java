class Person {

    private String[] family;
    private String name;

    //returns whether or not a name is found in the list of family members
    public boolean isFamilyMember(String name){
        // code not shown
    }

    //returns the name of the person
    public String getName(){
        return name;
    }

    //constructor not shown

}

class Experiment {

    //constructor not shown

    //Part A
    //Returns a random person from a list of people part of the experiment
    //Precondition : i and j are valid indexes and i < j.
    //Param i : starting index, Param j : final index
    public Person randomSelect(Person[] people, int i, int j){
        // write your code
    }

    //Part B
    //Return a list of randomly selected people from every 5 people sub group from a larger group
    //Preconditions : group contains more than 5 people (Person objects)
    public Person[] randomGroup(Person[] group){
        // write your code
    }

    //Part C
    //Returns true when potential bias exists
    //Bias will exist when a family member is found within the the same experiment as any of the subjects
    public boolean containsBias(Person[] group){
        // write your code
    }

}