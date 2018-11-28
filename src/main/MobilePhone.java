package main;

public class MobilePhone {

   int numberOfMobileOfGermanico;
   /*
   * Java reserved Key word
   * main, new, public, void, static, void
   * public =>> who can access? all public
   *
   *
   * */

   /*
   * This is called constructor of MobilePhone Class
   * Default constructor does not take any arguments
   * Default Constructor does not have any Argument
   */

   public MobilePhone(){
      System.out.println("I am inside constructor");
   }

   // This is declared by me, added a argument
   public MobilePhone(int numberOfMobileOfArnob){

      /* this is a keyword , it talks about the variable outside any method but
      inside the class*/
      this.numberOfMobileOfGermanico = numberOfMobileOfArnob;
      System.out.println("I am inside declared method");

   }

   public static void main(String[] args) {

      System.out.println("Allows you to run");
      MobilePhone asusZenPhone = new MobilePhone();
      asusZenPhone.makeCall();

      MobilePhone isoPhone = new MobilePhone(2);
      isoPhone.sendText();


   }

   public void makeCall (){

      System.out.println("This method will make phone call");
   }
   public void sendText(){
      System.out.println("This method will send text");
   }
}
