package main.controlflow;

class WhileDemo {
    
    /*
    * while (expression) {
    *     statement(s)
    *     }   
    */
    public static void main(String[] args){

        int count = 1;
        while (count < 11) {
            System.out.println("Count is: " + count);
            count++;
        }
    }
}
