package main.lecture03;

public abstract class PsionPhone implements SymbianMobile{


    @Override
    public void makeCall() {
        //This mathod will make call
        System.out.println(" This method will make call");

    }

    @Override
    public void sendText() {

        //This mathod will send Text
        System.out.println(" This method will send text");

    }
    // this method is unimplemented by Mr Psion
    public abstract void display();
}
