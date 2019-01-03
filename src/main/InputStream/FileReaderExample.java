package main.InputStream;

import java.io.FileReader;

public class FileReaderExample {

        public static void main(String args[])throws Exception{
            FileReader fr=new FileReader("..//src//test//java//Resources//Test.txt");
            int i;
            while((i=fr.read())!=-1)
                System.out.print((char)i);
            fr.close();
        }
    }

///*C:\Users\Rabeka\IdeaPsrc/resources/Test.txtrojects\test\src\test*/