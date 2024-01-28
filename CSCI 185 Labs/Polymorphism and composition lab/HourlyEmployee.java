public abstract class HourlyEmployee extends Employee {
    private double wageRate,hours,getPay;
HourlyEmployee(String n, String hire,double w,double hrs,double pay){
    super(n,hire);
    this.wageRate=w;
    this.hours=hrs;
    this.getPay=pay;
}
HourlyEmployee(HourlyEmployee other){
super(other.getName(),other.getHireDate());
this.wageRate=other.wageRate;
this.hours=other.hours;
this.getPay=other.getPay;
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
public double getGetPay() {
    return getPay;
}
public void setGetPay(double getPay) {
    this.getPay = getPay;
}

public String toString() {
    String S="";
    S+="\n Wage:"+wageRate+"\n Hours This Month:"+hours+"\n Paid Amount:"+getPay;
    S+=super.toString();
    return S;
}
}
