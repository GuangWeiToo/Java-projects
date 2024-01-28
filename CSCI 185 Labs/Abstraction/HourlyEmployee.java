public class HourlyEmployee extends Employee {
    private double wageRate,hours;
    public double getPay(){
        return (this.wageRate*hours);
    }
HourlyEmployee(String n, String hire,double w,double hrs){
    super(n,hire);
    this.hours=hrs;
    
}
HourlyEmployee(HourlyEmployee other){
super(other.getName(),other.getHireDate());
this.wageRate=other.wageRate;
this.hours=other.hours;

}
public double getWageRate() {
    return wageRate;
}
public void setWageRate(double wageRate) {
    this.wageRate = wageRate;
}
public double getHours() {
    return hours;
}
public void setHours(double hours) {
    this.hours = hours;
}


public String toString() {
    String S="";
    S+="\n Wage:"+wageRate+"\n Hours This Month:"+hours;
    S+=super.toString();
    return S;
}
}
