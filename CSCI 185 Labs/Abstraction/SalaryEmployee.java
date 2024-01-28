public class SalaryEmployee extends Employee {
   private double salary;
   public double getPay(){
       return (this.salary/12);
   }
SalaryEmployee(String n,String hireDate, double salary){
    super(n,hireDate);
    this.salary=salary;
   
}
SalaryEmployee(SalaryEmployee other){
super(other.getName(),other.getHireDate());
this.salary=other.salary;

}
public void setSalary(double salary) {
    this.salary = salary;
}
public double getSalary() {
    return salary;
}

public String toString() {
  String S="";
  S+="\n Salary:"+salary;
  S+=super.toString();
  return S;  
}
}
