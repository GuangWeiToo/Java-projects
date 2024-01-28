public class Animal{
private String species;
private int age;
private double weight;

Animal(String s, int a, double w){
this.species=s;
this.age=a;
this.weight=w;
}

Animal(Animal other){
    //error
    if (other== null){
        System.out.println("Invalid Animal");
        System.exit(0);
    }
}
public int getAge() {
    return age;
}
public void setAge(int age) {
    this.age = age;
}
public String getSpecies() {
    return species;
}
public void setSpecies(String species) {
    this.species = species;
}
public double getWeight() {
    return weight;
}
public void setWeight(double weight) {
    this.weight = weight;
}
public String toString(){
    return "\nSpecies:" +species+"\nAge:"+age+"\nWeight lb:"+weight;
}

 public static void main(String[] args) {
     Animal Jaguar = new Animal("Jaguar",10,15);
     Animal Elephant = new Animal("Elephant", 25, 100.3);
     Animal Falcon = new Animal("Falcon",12,5.5);
    System.out.println(Falcon.toString());
    System.out.println(Elephant.toString());
    System.out.println(Jaguar.toString());
 }
}