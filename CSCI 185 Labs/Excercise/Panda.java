public class Panda extends Animal{
    private String color;
public Panda(String s,double w,String c){
    super(s,w);
    this.color=c;
}
Panda(Panda other){
super(other.getSpecies(),other.getWeight());
this.color=other.color;
}
public void setColor(String color) {
    this.color = color;
}
public String getColor() {
    return color;
}
public void eat(){
    System.out.println("Panda eats bamboo");
}
public String toString() {
    String S="";
    S+="Color"+color;
    S+=super.toString();
    return S;
}
}
