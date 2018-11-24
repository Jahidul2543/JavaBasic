package main;

public class Mobile {

   int numberOfMobileOfGermanico;
   /*
   * Java reserved Key word
   * main, new, public, void, static, void
   * public =>> who can access? all public
   *
   *
   * */

   /*
   * This is called constructor of Mobile Class
   * Default constructor does not take any arguments
   * Default Constructor does not have any Argument
   */

   public Mobile(){
      System.out.println("I am inside constructor");
   }

   // This is declared by me, added a argument
   public Mobile(int numberOfMobileOfArnob){

      /* this is a keyword , it talks about the variable outside any method but
      inside the class*/
      this.numberOfMobileOfGermanico = numberOfMobileOfArnob;
      System.out.println("I am inside declared method");

   }

   public static void main(String[] args) {

      System.out.println("Allows you to run");
      Mobile  asusZenPhone = new Mobile();
      asusZenPhone.makeCall();

      Mobile  isoPhone = new Mobile(2);
      isoPhone.sendText();


   }

   public void makeCall (){

      System.out.println("This method will make phone call");
   }
   public void sendText(){
      System.out.println("This method will send text");
   }
}
