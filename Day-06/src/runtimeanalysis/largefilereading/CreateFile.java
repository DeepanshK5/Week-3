package runtimeanalysis.largefilereading;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {

        createFile("1 MB File",1);
        createFile("100 MB File",100);
        createFile("500 MB File",500);

    }

    static void createFile(String filename,int n){
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(filename))){
            int size = n*1024*1024;
            long byteswritten = 0;
            while(byteswritten<size){
                bw.write("I am Adding this line");
                byteswritten += "I am Adding this line".getBytes().length;
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
