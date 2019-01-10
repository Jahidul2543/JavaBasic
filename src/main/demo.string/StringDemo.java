package main.demo.string;

public class StringDemo {
    public static void main(String[] args) {

        String str = "Name";
               str = "Jahid";

               str.length();
          String str2 = str.replace('J', 'Z');

        System.out.println(str);
        System.out.println(str2);

      StringBuffer courseName = new StringBuffer("Selenium");
                   courseName.append(" Automation");

        System.out.println(courseName);


    }
}
