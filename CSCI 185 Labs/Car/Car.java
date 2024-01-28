public class Car {
private String Vin_number, make_model;
private int num_doors;

// constructors
Car(String vin,String model, int doors){
this.Vin_number= vin;
this.make_model=model;
this.num_doors=doors;
}

public Car(){

}
//Set/Get methods
public void setVin(String vin){
this.Vin_number = vin;
}
public String getVIN(){
    return this.Vin_number;
}
public void setMakeModel(String model){
    this.make_model=model;
}
public String getMakeModel(){
    return this.make_model;
}
public void setNumDoors(int doors){
    this.num_doors=doors;
}
public int getNumDoors(){
    return this.num_doors;
}

public String toString(){
    return "Car Info:" +"\n Vin #:"+ Vin_number+"\n Model:"+make_model+"\nDoor #:"+ num_doors;
}
 public static void main(String[] args) {
    Car my_car = new Car("456556574NX", "Mustang",4 );
    System.out.println(my_car.toString());
}

}