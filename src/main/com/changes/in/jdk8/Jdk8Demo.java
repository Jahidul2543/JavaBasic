package main.com.changes.in.jdk8;

import java.util.ArrayList;
import java.util.Iterator;

public class Jdk8Demo implements  DefaultMethodDemo {
    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<>();
        //add element to Arraylist
        arrList.add(150);
        arrList.add(200);
        arrList.add(300);
        arrList.add(25);
        arrList.add(90);

        arrList.forEach(it -> System.out.println(it));
    }

    DefaultMethodDemo dm = () ->{
        System.out.println("I am in instance of DefaultMethodDemo Interface");
    };

    @Override
    public void doWhateverYouLike() {

    }
}
