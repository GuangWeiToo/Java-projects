
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.*;

public class BinaryArrayNum{
public static void main(String[] args) {

    String filename="Output.bin";
    //Writer
    try {
        FileOutputStream fileOs=new FileOutputStream(filename);
        ObjectOutputStream output= new ObjectOutputStream(fileOs);
        output.writeInt(28);
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
        ObjectInputStream input= new ObjectInputStream(fileIs);
        int x=input.readInt();
        System.out.println(x);
        input.close();
      
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    }catch(IOException e){
        e.printStackTrace();
    }
    System.out.println("Done Reading");
}
}