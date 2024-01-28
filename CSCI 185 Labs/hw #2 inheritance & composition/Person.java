/*
Guang Wei Too
Wenjia Li
CSCI-185
10/31/2021
Fall 2021
*/
public class Person {
    //data
    private String name,ssn;
    private int age;
    private boolean alive;

    // constructor
    Person(String n,String SSN,boolean alive,int age){
        this.name=n;
        this.ssn=SSN;
        this.alive=alive;
        this.age=age;
    }

    //copy
    public Person(Person other){
        this.name= other.name;
        this.ssn= other.ssn;
        this.alive=other.alive;
        this.age=other.age;

    }
    // get/set
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setSsn(String ssn) {
        this.ssn = ssn;
    }
    public String getSsn() {
        return ssn;
    }
    public void setAlive(boolean alive) {
        this.alive = alive;
    }
    public boolean getalive() {
        return this.alive;
    }

    // toString
    public String toString() {

        return "\nName:"+name+"\nSSN:"+ssn+"\nAlive:"+ this.alive+"\nAge:"+age;
    }
}