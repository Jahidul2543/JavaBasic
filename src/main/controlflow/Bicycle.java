package main.controlflow;

public class Bicycle {

    boolean isMoving = true;
    int currentSpeed = 4;

    /*
    * if-then statement
    * if(boolean statement){
    *  // stament is true this code block will be executed
    *    }
    * */
    public void applyBrakes() {

        // the "if" clause: bicycle must be moving
        if (isMoving){
            // the "then" clause: decrease current speed
            currentSpeed--;
            System.out.println("Speed will decrese after brake currentSpeed " + currentSpeed);
        }
    }
    public void applyBrakesAgain(){

        isMoving = false;

        if(isMoving){
            // the "then" clause: decrease current speed
            currentSpeed--;
        }
        else {

            System.err.println("The bicycle has already stopped!");

        }

    }

    public static void main(String[] args) {
        Bicycle myBicycle = new Bicycle();
        myBicycle.applyBrakes();
        myBicycle.applyBrakesAgain();
    }

}
