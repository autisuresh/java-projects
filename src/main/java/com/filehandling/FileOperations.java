package com.filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileOperations {
    public static void main(String[] args) throws Exception {

        try{
            File file = new File("test_file.txt");
            if (file.createNewFile()) {
                System.out.println(file.getName());
            }
        }catch (IOException e){
            e.printStackTrace();
        }

        try{
            FileWriter writer = new FileWriter("test_file.txt");
            writer.write("this is the  test file. ");
            writer.write("used writer to write in this file.");
            writer.close();
        }catch (IOException e) {
            e.printStackTrace();
        }
        
    }
}
