package main.understandingInterface;
public abstract class BasicMobile implements Mobile {

    /*
    * Where there is at least one unimplemented method that class named as abstract class
    *
    *
    *
    * */
    public BasicMobile (){
        System.out.println("First constructor");
    }

    public BasicMobile(String str){
        str = "load";
        System.out.println("This is 2nd Constructor: " + str);
    }

    public void calling() {
        System.out.println("This will call");
    }

    public void messaging() {
        System.out.println("This will send text");

    }

    public abstract void touch();



}
