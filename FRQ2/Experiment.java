class Person {

    private String[] family;
    private String name;

    //returns the person's list of family members
    public String[] getFamily(){
        return family;
    }

    //returns the name of the person
    public String getName(){
        return name;
    }

    //constructor not shown

}

class Experiment {

    private Person[] subjects;

    //constructor not shown

    //Part A
    //Returns a random person from a list of people part of the experiment
    public Person randomSelect(Person[] people){
        // write your code
    }

    //Part B
    //Return a list of randomly selected people from every 5 people sub group from a larger group
    //Preconditions : group contains more than 5 people (Person objects)
    public Person[] randomGroup(Person[] group){
        // write your code
    }

    //Part C
    //Assume the [subjects] list has been instantiated
    //Returns true when potential bias exists
    //Bias will exist when a family member is found within the the same experiment as any of the subjects
    public boolean containsBias(Person[] otherGroup){
        // write your code
    }

}