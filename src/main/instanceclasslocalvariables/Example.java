package main.instanceclasslocalvariables;

public class Example {

    /*
    * Instance Variable
    * Outside method
    * not a static variable
    * Instance variables (non-static fields) are unique to each instance of a class
    * */
    public  int instanceVariable;
    private int instanceVariable2;

    /*
     * Class Variable Variable
     * Outside method
     * A static variable
     * */
    public static int classVariable = 5;

    public Example (){
        System.out.println("Default Constructor");
    }

    public Example (int instanceVariable, int instanceVariable2){

        this.instanceVariable = instanceVariable;

    }
    public static void  usingStaticVariable(){
        System.out.println( " Inside static method, classVariable: " + classVariable);
    }

    /*
    * Local variable
    * Declared Inside a method
    * Local variables store temporary state inside a method.
    * */

    public void localVariabel(){
        int localVaraiable = 10 ;

        int sum = localVaraiable + classVariable;
        System.out.println(sum);
    }

    /*
    * Parameters
    * Parameters are variables that provides extra information to a method;
    * both local variables and parameters are always classified as "variables" (not "fields").
    * */

    public void parameterExample(int a){

        int b = 5;
        int sum = a + b ;
        System.out.println("Result of Sum: " + sum);

    }

    public static void main(String[] args) {
        Example objOfExamle = new Example();
        objOfExamle.usingStaticVariable();
        objOfExamle.localVariabel();

        // we are creating a object with 2 arguments
        Example objectOfExample2 = new Example(2,2);
        objectOfExample2.parameterExample(5);

    }

}
