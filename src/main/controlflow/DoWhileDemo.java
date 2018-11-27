package main.controlflow;

public class DoWhileDemo {
    /*
     *do {
     *statement(s)
     *   }
     * while (expression);
     */
    public static void main(String[] args){
        int count = 1;
        do {
            System.out.println("Count is: " + count);
            count++;
        } while (count < 11);
    }
}
