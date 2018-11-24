package main;


/*
 * @Author Md Jahidul Islam
 * class Name Car talks about any car in the world
 * to make a car object we need to meet some criteria,
 * these are the criteria is defined in the Car blueprint or Car class.
 * We can create many car objects from this blueprint, such as BMW, Toyota, Honda, Ford etc
 *
 */

public class Car {

    /*
     *
     * How do we declare a variable?
     * At first I have to say the type of data on left and then name of the variable where
     * I want to store the value
     * The name of a variable holds the value assigned on the right side
     *
     * */
    // this is declaring and assigning value to a variable
    int speed = 5;


    /*
     * How to create a method in Java?
     * Methods are activities/behaviours of an Object (Starting and Stopping a Car )
     * public void nameOfTheMethod(){
     *    This is method body
     *    In order to stop a car we need to do fe activities
     *    Like holding the break and putting the gear in stop position once it is in stop
     *    }
     * */

    public void stopCar(){
        /*
         * If I make car speed 0 this will stop
         * This method will use break to stop the car.
         *
         * */
        // In order to stop the car make speed zero by using brake.
        speed = 0;

        /*
        * What is System.out.println();?
        * It is a way to print String message in the
          console.
        * When we run the application and see this
          line is printing we
        * understand that this line of code is
          executed.
        * */

        System.out.println("This method will stop the car by reducing the car speed to 0");
        System.out.println("Car is Stopped");
    }
    /*
     * What is the main method?
     * In simple it is the entry point of a Java application
     * JVM only can enter in the application if it has any main method
     * You can think this way => A house with one main door. If you want to go inside you need to
     * go through the main door. The main door allows you to go in.
     * Same for a Java application main method allows JVM to go inside the application
     * Anything inside the main method will be executed by the JVM
     * By Object, we call methods inside the main method to execute those methods/functions
     *
     * */
    public static void main(String[] args) {

        /*
         * How we can create an object of a class?
         * We use  Java reserved keyword "new" Typing the class name with (), which is called the constructor
         * In the real world if someone can construct something we say that he is a constructor
         * In the world of Java when we need to construct an object of a class we use the constructor of that class
         * Default constructor of Car class is <  Car()  >
         *
         */
        // creating a car object from Car blueprint by the help of constructor of the Class Car
        Car subaruCar = new Car();

        /*
         * Now we have an object of Type Car
         * As we know we can perform activities only when we have Object
         * If you can remember the example of Light and Bicycle we can only switch on and
         * off a light when we have that object
         * So we can use the functionality of the car
         * In the programming world of Java we call a method by the help of Object of that same Class
         * */

        subaruCar.stopCar();

    }
}

/*
 * Expected output
 * This method will stop the car by reducing the car speed to 0
 * Car is Stopped
 *
 * */
