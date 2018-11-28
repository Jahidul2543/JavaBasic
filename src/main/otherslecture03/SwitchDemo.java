package main.otherslecture03;

public class SwitchDemo {




    public static void main(String[] args) {

        int month = 2;
         String monthName;
        switch (month){
            case 1:
                monthName = "Jnauary";
                break;
            case 2:
                monthName = "Feb";
                break;
        }
        System.out.println();

        boolean dinner = false;

        while (dinner){

            System.out.println("I feel better");
            break;
        }
        do {

            System.out.println("Prepare dinner");
        } while (dinner);
    }
}
