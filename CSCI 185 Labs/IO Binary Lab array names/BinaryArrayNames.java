/*
Guang Wei Too
Dr.Wenjia Li
CSCI 185 Fall 2021
12/08/2021
*/

import java.io.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;



public class BinaryArrayNames{
public static void main(String[] args) {

    String [] names= new String[5];
    names[0]=("Emma Watson");
    names[1]=("Choi Soobin");
    names[2]=("Tom Holland");
    names[3]=("Willem Dafoe");
    names[4]=("Tobey Maguire");
    
    String filename="Output.dat";
    //Writer
    try {
        FileOutputStream fileOs=new FileOutputStream(filename);
        DataOutputStream output= new DataOutputStream(fileOs);
        for(int i=0;i<names.length ;i++) {
            output.writeUTF(names[i]);
        }
        //output.writeUTF(names[i]);
        output.close();
    }catch(FileNotFoundException e){
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    }
    System.out.println("Done writing");
    //Reader
    try {
        FileInputStream fileIs= new FileInputStream(filename);
        DataInputStream input= new DataInputStream(fileIs);
        for(int i=0;i<names.length ;i++) {
            String name= input.readUTF();
            System.out.println(name);
        }
        input.close();
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    }catch(IOException e){
        e.printStackTrace();
    }
    System.out.println("Done Reading");
   
}
}