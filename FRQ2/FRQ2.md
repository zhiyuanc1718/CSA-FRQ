
# FRQ #2 Practice

The following code can be found in [Experiment.java](./Experiment.java) file. Read through the comments and examples below.

A scientist wants to conduct an experiment by selecting a group of subjects, and she wants to make sure that subjects are selected randomly given a list of people. She will also make sure that she divides the entire list of people into same sub-group sizes known as clusters and select one person from each subgroup. Lastly, before she begins her experiment, she must make sure no subjects are related to reduce bias.

```java
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
```

## Part A randomSelect

Selects a random Person object from the Array people and returns it.

```java
    //Part A
    //Returns a random person from a list of people part of the experiment
    public Person randomSelect(Person[] people){
        // write your code
    }
```

## Part B randomGroup

This method will divide the larger group into subgroups of 5 people each and select a random Person from each sub group to form a list of subjects for the experiment.
**You must use randomSelect() method correctly to get full credit, Assume that randomSelect() works as intended regardless of your code in Part A**

```java
    //Part B
    //Return a list of randomly selected people from every 5 people sub group from a larger group
    //Preconditions : group contains more than 5 people (Person objects)
    public Person[] randomGroup(Person[] group){
        // write your code
    }
```

## Part C containsBias

This method checks whether another list of subjects contains family members of any of our subjects.
**You must use getFamily() and getName() methods correctly to get full credit**

```java
    //Part C
    //Assume the [subjects] list has been instantiated
    //Returns true when potential bias exists
    //Bias will exist when a family member is found within the the same experiment as any of the subjects
    public boolean containsBias(Person[] otherGroup){
        // write your code
    }
```

For example : if our group contains a person name "Joe D" who has a family member named "John D" and who happens to be found in the [otherGroup] list of subjects, the method will return true. If all subjects are not related across both list of subjects, the method will return false.