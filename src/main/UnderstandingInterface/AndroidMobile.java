package main.understandingInterface;

public class AndroidMobile implements Mobile {

    int x = a +4;

    public AndroidMobile(){

    }
    public AndroidMobile (int y){

       // this.x = y;
    }

    public static void main(String[] args) {

        int y = a/0;
        String name = "Abdul";

        AndroidMobile mobileName = new AndroidMobile();

        AndroidMobile androidMobile = new AndroidMobile(2);
        mobileName.memory();
    }
    public void calling() {
        System.out.println("This will call");
    }

    public void messaging() {
        System.out.println("This will send text");

    }

    public void camera() {
        System.out.println("This will take photo");
    }

    public void touchFunction(){
        System.out.println("This is touch functionality");
    }

    public void memory(){
        System.out.println("Sum: " + x);
    }
}

/*

*Thi is called abstract method public void calling();
* 1 Must implement all the methods of interface
* 2. Can have more methods
* 3. Should not have any abstract method
*
* */

/*
* <Abduls Statement>
* It will print all the lines in sout
*
*
* Except Class Object Method
*
* */
