/*
Guang Wei Too
Wenjia Li
CSCI-185
10/31/2021
Fall 2021
*/
//derived Class
public class Teacher extends Person {

    //data
    private String ID;
    private int monthly_salary;
    private int num_yr_prof;

    //constructor
    public Teacher(String name,String SSN, boolean alive, int age,String id,int salary,int yr_num){
        super(name,SSN,alive,age);
        this.ID= id;
        this.monthly_salary=salary;
        this.num_yr_prof=yr_num;
    }

    //copy constructor
    public Teacher(Teacher other){
        super(other.getName(),other.getSsn(),other.getalive(),other.getAge());
        this.ID= other.ID;
        this.monthly_salary=other.monthly_salary;
        this.num_yr_prof= other.num_yr_prof;
    }

    // set/get method
    public void setID(String iD) {
        this.ID = iD;
    }
    public String getID() {
        return ID;
    }
    public void setSalary(int salary) {
        this.monthly_salary = salary;
    }
    public int getSalary() {
        return monthly_salary;
    }
    public void setNum_yr_prof(int num_yr_prof) {
        this.num_yr_prof = num_yr_prof;
    }
    public int getNum_yr_prof() {
        return num_yr_prof;
    }

    //toString
    public String toString(){
        String T="";
        T += super.toString();
        T += "\nTeacher ID:"+ ID+"\nSalary:$"+monthly_salary +"\nYears in Profession:"+num_yr_prof ;

        return T;
    }
}