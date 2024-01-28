public class Person{
public Person(int id,String name, int age,String DOB,int SSN, String phoneNumber, String height, double weight, String medicalConditions){
this.id=id;
this.n=name;
this.a=age;
this.SSN=SSN;
this.DOB=DOB;
this.phoneNumber=phoneNumber;
this.height=height;
this.weight=weight;
this.medicalConditions=medicalConditions;
}
public void setId(int id) {
    this.id = id;
}
public int getId() {
    return id;
}
public void setName(String name){
    this.n=name;
    
}
public String getName() {
    return n;
}
public void setAge(int age) {
    this.a = age;
}
public int getAge() {
    return a;
}
public void setDOB(String dOB) {
    DOB = dOB;
}
public String getDOB() {
    return DOB;
}
public void setSSN(int sSN) {
    SSN = sSN;
}
public int getSSN() {
    return SSN;
}
public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
}
public String getPhoneNumber() {
    return phoneNumber;
}
public void setHeight(String height) {
    this.height = height;
}
public String getHeight() {
    return height;
}
public void setWeight(float weight) {
    this.weight = weight;
}
public double getWeight() {
    return weight;
}
public void setMedicalConditions(String medicalConditions) {
    this.medicalConditions = medicalConditions;
}
public String getMedicalConditions() {
    return medicalConditions;
}
public String toString(){
    return "Name:"+n+"\n"+"Age:"+a+"\n"+"DOB:"+DOB+"\n"+"SSN:"+SSN+"\n"+"Phone Number:"+phoneNumber+"\n"+"Height ft:"+height+"\n"+"Weight lb:"+weight+"\n"+"Medical Conditions:"+medicalConditions+"\n";
    
}
private int a,SSN, id;
private String n,phoneNumber,DOB, medicalConditions,height;
private double weight;
    
}
