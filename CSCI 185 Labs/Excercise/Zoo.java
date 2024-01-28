public class Zoo {
    public void whatToEat(Animal a){
        a.eat();
    }
 public static void main(String[] args) {
     Panda cute= new Panda("Panda",200,"Black and White");
     Monkey active= new Monkey("Monkey",10,12);
     Animal n= new Animal();
     Zoo bronx_zoo= new Zoo();

     bronx_zoo.whatToEat(cute);
     bronx_zoo.whatToEat(active);
     bronx_zoo.whatToEat(n);
 }   
}
