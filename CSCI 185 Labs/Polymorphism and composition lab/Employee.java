

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
    return " Employee Info:"+"\n Employee Name:"+name+"\n Hired Date:"+hireDate;
}
public abstract double getPay();
public boolean samePay(Employee other){
    return(this.getPay()==other.getPay());
}
}
