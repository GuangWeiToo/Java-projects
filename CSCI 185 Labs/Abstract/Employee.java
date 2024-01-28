public abstract class Employee {
    private String name, hireDate;
public Employee(String n,String hire){
    this.name=n;
    this.hireDate=hire;
}
Employee(Employee other){
    this.hireDate=other.hireDate;
    this.name=other.name;
}
/*
Guang Wei Too
Wenjia Li
CSCI-185
10/31/2021
Fall 2021
*/
public String getHireDate() {
    return hireDate;
}
public void setHireDate(String hireDate) {
    this.hireDate = hireDate;
}
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public String toString() {
    return "\n Employee Info:"+"\n Employee Name:"+name+"\n Hired Date:"+hireDate;
}
public abstract double getPay();
public abstract int getDaysOff();
public boolean samePay(Employee other){
    return(this.getPay()==other.getPay());
}
public boolean sameDaysOff(Employee other){
    return (this.getDaysOff()==other.getDaysOff());
}
}