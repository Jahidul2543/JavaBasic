package main.instanceclasslocalvariables;

public class Example2 {
    public static void main(String[] args) {
        // Class variable or a variable with static field can be accessed
        // by other class without creating object of that class
        int y = Example.classVariable;
        System.out.println("Value Read from the EqualityRelationalOperator Class " + y);

    }
}
