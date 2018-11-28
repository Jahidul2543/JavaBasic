package main.understandingInterface;
public class IosMobile extends BasicMobile {


    public IosMobile(String str){
        super(str);
        System.out.println("Str in IosMobile Constructor: " + str);
    }


    public void touch() {

    }

    public void camera() {

    }

    //Over loading happens within same class. Same method different arguments
    public void camera(String cam){

    }

    // Pverriding happens between classes
    @Override
    public void calling() {
        super.calling();
    }

    public static void main(String[] args) {
        IosMobile obj1 = new IosMobile("life");// str = "life"


    }

    // Can i have an abstract method in a class??
    // What is the menaing of below satement.


}
