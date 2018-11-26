package enumdemo;

public class EnumTest {
    Day day;
    public EnumTest(Day day){
        this.day = day;
    }
    public void howWillBeTheDay(){

        switch (day){
            case MON:
                System.out.println("Lazy Day");
                break;
            case TUE:
                System.out.println("Better Day");
                break;
            case WED:
                System.out.println("Happy day coming");
                break;
            case THU:
                System.out.println("Working from home day");
            case FRI:
                System.out.println("Waiting for weekend");
                break;
        }

    }
    public static void main(String[] args) {
     EnumTest objOfEnumTest = new EnumTest(Day.FRI);
     objOfEnumTest.howWillBeTheDay();

    }
}
