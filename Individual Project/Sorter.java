public class Sorter extends SelectionSort implements Runnable {
    public void run(){
        for(int i=0;i<=2 ;i++){
        createArray();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Sorter Sleep Problem");
        }
    }
    }
}
//draw array on gui here
    