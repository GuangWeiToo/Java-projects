/*
Guang Wei Too
Dr.Wenjia Li
CSCI 185 Fall 2021
12/04/2021
*/
import java.io.*;
import java.util.Arrays;

public class ioRandnum{
public static void main(String[] args) {
//Exception handling for writing to txt
try {
    
    int min=-100;
    int max= 100;
    int range=max-min;  
    int[] numbers = new int[10];
    for(int i=0;i<numbers.length;i++){
        numbers[i]=(int)(Math.random()*range)+min;
    }
    BufferedWriter writer= new BufferedWriter(new FileWriter("Output.txt"));
        writer.write(Arrays.toString(numbers));
        writer.close();
} catch (IOException e) {
    e.printStackTrace();
}
//Exception handling for reading from txt
try {
    BufferedReader reader= new BufferedReader(new FileReader("Output.txt"));
    System.out.println(reader.readLine());
    reader.close();
} catch (Exception e) {
    e.printStackTrace();
}
}
}