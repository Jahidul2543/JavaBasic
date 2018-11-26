public class ForDemo {

    /*
    * for (initialization; termination;increment){
    *
    *             statements
    *             }
    *   The initialization expression initializes the loop; it's executed once, as the loop begins.
    *   When the termination expression evaluates to false, the loop terminates.
    *   The increment expression is invoked after each iteration through the loop;
    *   it is perfectly acceptable for this expression to increment or decrement a value.
    *
    * */

        public static void main(String[] args){
            for(int i=1; i<11; i++){
                System.out.println("Count is: " + i);
            }
            //Enhanced for loop
            int[] numbers =
                    {1,2,3,4,5,6,7,8,9,10};
            for (int item : numbers) {
                System.out.println("Count is: " + item);
            }
        }

}
