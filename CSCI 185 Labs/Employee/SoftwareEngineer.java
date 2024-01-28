public class SoftwareEngineer extends Employee {
    private double annual_salary;
    private String languanges_used;
SoftwareEngineer(String n,String d,int a, double s,String L){
    super(n, d, a);
    this.annual_salary=s;
    this.languanges_used=L;
}
SoftwareEngineer(SoftwareEngineer se){
    super(se.getName(),se.getHire_date(),se.getAge());
    this.annual_salary=se.annual_salary;
    this.languanges_used=se.languanges_used;
}
public void setAnnual_salary(double annual_salary) {
    this.annual_salary = annual_salary;
}
public double getAnnual_salary() {
    return annual_salary;
}
public void setLanguanges_used(String languanges_used) {
    this.languanges_used = languanges_used;
}
public String getLanguanges_used() {
    return languanges_used;
}
public String toString() {
    String output = super.toString();
    output+= "\n\nSoftware Engineer info:"+"Anual Salary:"+ this.annual_salary+"Languages known:"+languanges_used;
    return output;
}
}
