package main.otherslecture03;

public class VariablesDemo {
    //Instance variable
    static int x = 2;
    //class variable
    static int  z = 4;

    public void sum(){
        int y =4;
    }
    public static void usingStatic(){

        System.out.println("This is a static method");
    }

    public  void usingNonStatic(){
        int sum = x + z;
        System.out.println("This is a Non-static method: " + sum);
    }

    public static void main(String[] args) {

        VariablesDemo obj = new VariablesDemo();
        obj.usingNonStatic();

        if(x>=z){
            System.out.println("x is greater than z ");
        }
        else {
            System.out.println("X is smaller than z");
        }
    }
}
