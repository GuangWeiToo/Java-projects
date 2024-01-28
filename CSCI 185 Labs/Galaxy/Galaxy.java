public class Galaxy{
    private int numStars;
    private double diameter_galaxy;
    private String name;
    private Star[] starList;

public Galaxy(int num,String name, double diameter, Star[]starList){
this.numStars=num;
this.name=name;
this.diameter_galaxy=diameter;
this.starList= new Star[starList.length];
for(int i= 0;i< starList.length; i++){
    this.starList[i]= new Star(starList[i]);
    }
}
//Copy and check out
Galaxy(Galaxy other){
    if(other==null){
        System.out.println("Invalid Galaxy!");
        System.exit(0);
    }
   this.numStars= other.numStars;
   this.diameter_galaxy=other.diameter_galaxy;
   this.numStars=other.numStars;
   this.starList=other.starList;
   this.name=other.name;

}
// Set/Get methods
public void setNumStars(int numStars) {
    this.numStars = numStars;
}
public int getNumStars() {
    return numStars;
}
public void setDiameter_galaxy(double diameter_galaxy) {
    this.diameter_galaxy = diameter_galaxy;
}
public double getDiameter_galaxy() {
    return diameter_galaxy;
}

public Star[] getStar() {
		
    Star[] temp = new Star[this.starList.length];
    
    for(int i = 0; i < temp.length; i++) {
        temp[i] = new Star(this.starList[i]);
    }
    
    return temp;
    
}
public String toString(){
 String r = "\n Galaxy Info:"+ "\n Name:"+name+"\n Diameter Light Years:"+diameter_galaxy+"\n Amount of Stars:"+numStars;
 for(int i = 0; i < this.starList.length;i++) {
    r += "\n Star #" + (i+1) + ":\n" + this.starList[i].toString() + "\n\n";


}

return r;
}

}