import java.awt.Color;
import java.util.concurrent.TimeUnit;

public class SelectionSort {
     int arr[];
     int alreadySorted;
     int markedPosition;
    SelectionSort(){
        
    }
    public void randomArray(){
        int min=5;
        int max=15;
        int j=(int)(Math.random()*(max-min)+min);
        arr= new int[j];
        
        for(int i=0; i< arr.length; i++){
            arr[i]=(int)(Math.random()*1000);
        }
    }
    
    void sort()
    {
        int n = arr.length;
 
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            markedPosition=i;
            alreadySorted= i+1;
            for (int j = i+1; j < n; j++)
            
            if (arr[j] < arr[min_idx])
                    min_idx = j;
            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
            
            //Delay
            try {
                //Prints the each array content delayed
               // System.out.print(arr[i]+" ");
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                System.out.println("SelectionSort Sleep Problem");
            }
            
        }
    }
 
    public void draw(){
        //check what is sorted will be used for gui
        for(int i=0; i<arr.length;i++){
        if (i==markedPosition){
          //  g.setColor(Color.red);
        }else if(i<=alreadySorted){
           // g.setColor(Color.blue);
        } else{
           // g.setColor(Color.black);
        }
       // g.drawLine(i * deltaX, 0, i * deltaX, arr[i]);
    }
}
    public void createArray(){
        randomArray();
        sort();
    }
}

/*Disabled
// Prints the array
    void printArray()
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
*/
