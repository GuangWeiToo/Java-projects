public class FibonacciNumbers{
//[0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181 ]20 fibonacci numbers

private int a;//amount of numbers wanted

//constructer
FibonacciNumbers(int b){
this.a=b;
}

public static int fibonacci(int n){
//ignore 0 and 1
if(n<=1){
    return n;
}
// Recursion and formula
return fibonacci(n-1)+fibonacci(n-2);
}

public void getNumbers(){
    //when a is 20 run until 19
    for (int i = 0; i < a; i++) {
        System.out.print(fibonacci(i) + "|");
    }

}
public static void main(String[] args) {
    FibonacciNumbers FN= new FibonacciNumbers(20);
    FN.getNumbers();
}
}