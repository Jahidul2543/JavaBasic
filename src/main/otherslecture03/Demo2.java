package main.otherslecture03;

public class Demo2 {

    int c = VariablesDemo.z;


    public void demo(){
       int a = VariablesDemo.z;

       VariablesDemo.usingStatic();
       VariablesDemo objOfVariablDemo = new VariablesDemo();
       objOfVariablDemo.usingNonStatic();
    }
}
