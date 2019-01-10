package main.InputStream;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferReaderExample {
    public static void main(String args[])throws Exception{
        //File filepath = new File(System.getProperty("user.dir") +  "/src/resources/Test.txt");

      // FileReader fr = new FileReader(filepath.getAbsoluteFile());
        FileReader fr=new FileReader("/Users/jahidul/IdeaProjects/JavaBasic1212/src/resources/Test.txt");

        BufferedReader br=new BufferedReader(fr);

        int i;
        while((i=br.read())!=-1){
            System.out.println((char)i);
        }
        br.close();
        fr.close();
    }
}


/**
 *
 * File filepath = new File(System.getProperty("user.dir") +  "/testData/TestData.xlsx");
 *
 *
 * */