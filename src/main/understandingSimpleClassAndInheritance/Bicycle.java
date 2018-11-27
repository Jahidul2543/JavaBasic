package main.understandingsimpleclassandinheritance;



class Bicycle {

    int cadence = 0;
    int speed = 0;
    int gear = 1;
     String cycleBrand = "Bmx";
     char grade = 'A';
     double number= 4.000000000;
     float floatNumber= 4.00000000F;
     long longDataType = 12000000000L;
     boolean lightIsOn = false;

    void changeCadence(int newValue) {
        cadence = newValue;
        System.out.println("This will change cadence");
    }

    void changeGear(int newValue) {
        gear = newValue;
        System.out.println(" This will change gear");
    }

    void speedUp(int increment) {
        speed = speed + increment;
        System.out.println("This will speedup");
    }

    void applyBrakes(int decrement) {
        speed = speed - decrement;
    }

    void printStates() {

        System.out.println(
                        "cadence:" + cadence +
                        " speed:" + speed+
                        " gear:" + gear);
    }



    public static void main(String[] args) {
        // We create object of Bicycle type
        Bicycle jenysBicycle = new Bicycle();

        jenysBicycle.changeCadence(20);
        jenysBicycle.changeGear(4);
        jenysBicycle.speedUp(15);


    }

}