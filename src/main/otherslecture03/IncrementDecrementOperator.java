package main.otherslecture03;

public class IncrementDecrementOperator {
    public static void main(String[] args) {
        int x = 1;
            //2
          // 2
        //++x =2
        //x++ =1
        //--------
         x = x++ + ++x; //4
        System.out.println("Value of x: " + x);
    }
}
