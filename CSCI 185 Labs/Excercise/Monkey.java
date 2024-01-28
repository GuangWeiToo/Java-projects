public class Monkey extends Animal {
    private int age;
public Monkey(String s, double w,int a){
    super(s,w);
    this.age=a;
}
Monkey(Monkey other){
super(other.getSpecies(),other.getWeight());
this.age=other.age;
}
public void setAge(int age) {
    this.age = age;
}
public int getAge() {
    return age;
}
public void eat(){
    System.out.println("Monkey eats banana");
}
public String toString() {
    String S="";
    S+="\n Age:";
    S+=super.toString();
    return S;  
}
}   
