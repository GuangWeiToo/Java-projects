/*
Guang Wei Too


*/
public class Star {
    //data
    private String name,type;
    private double diameter, surfaceTemp;
    private int age;
Star(String n, double d, double s,int a,String t){
this.name=n;
this.type=t;
this.diameter=d;
this.surfaceTemp=s;
this.age=a;

}
//Copy and Check out
public Star(Star other){
if (other== null){
    System.out.println("Invalid!");            
    System.exit(0); 
}
this.type=other.type;
this.name=other.name;
this.diameter=other.diameter;
this.surfaceTemp=other.surfaceTemp;
this.age=other.age;
}
//Set/Get methods
public void setName(String name) {
    this.name = name;
}
public String getName() {
    return name;
}
public void setDiameter(double diameter) {
    this.diameter = diameter;
}
public double getDiameter() {
    return diameter;
}
public void setSurfaceTemp(double surfaceTemp) {
    this.surfaceTemp = surfaceTemp;
}
public double getSurfaceTemp() {
    return surfaceTemp;
}
public void setAge(int age) {
    this.age = age;
}
public int getAge() {
    return age;
}
public String getType() {
    return type;
}
public void setType(String type) {
    this.type = type;
}
//toString
public String toString(){
return "\n Star Info:"+ "\n Name:"+name+"\n Diameter Kilometer:"+diameter+"\n Surface Temperature Kelvin:"+surfaceTemp+"\n Age:"+age;
}

}
