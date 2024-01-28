public class Animal{
    private String species;
    private double weight;
public Animal(String s, double w){
this.species=s;
this.weight=w;
}
Animal(){
    
}
Animal(Animal other){
this.species=other.species;
this.weight=other.weight;
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
public void eat(){
System.out.println("Unknown");
}

public String toString() {
    return "\nSpecies"+species+"\nWeight:"+weight;
}

}