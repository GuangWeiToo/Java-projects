public abstract class SalaryEmployee extends Employee {
   private double salary, getPay;
SalaryEmployee(String n,String hireDate, double salary,double getPay){
    super(n,hireDate);
    this.salary=salary;
    this.getPay=getPay;
}
SalaryEmployee(SalaryEmployee other){
super(other.getName(),other.getHireDate());
this.salary=other.salary;
this.getPay=other.getPay;
}
public void setSalary(double salary) {
    this.salary = salary;
}
public double getSalary() {
    return salary;
}
public void setGetPay(double getPay) {
    this.getPay = getPay;
}
public double getGetPay() {
    return getPay;
}

public String toString() {
  String S="";
  S+="\n Salary:"+salary+"\n Paid Amount:"+getPay;
  S+=super.toString();
  return S;  
}
}
