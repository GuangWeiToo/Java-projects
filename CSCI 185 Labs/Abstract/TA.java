/*
Guang Wei Too
Wenjia Li
CSCI-185
10/31/2021
Fall 2021
*/
public class TA extends Employee{
    private double hourWorked;
    private int daysWorked;
public TA(String n,String hire, double h, int d){
super(n,hire);
this.hourWorked=h;
this.daysWorked=d;
}
TA(TA other){
    super(other.getName(),other.getHireDate());
    this.hourWorked=other.hourWorked;
    this.daysWorked=other.daysWorked;
}
public double getPay(){
    return (this.hourWorked*15);
}
public int getDaysOff(){
    return (28-this.daysWorked);
}
public void setHour(double hour) {
    this.hourWorked = hour;
}
public double getHour() {
    return hourWorked;
}
public void setDaysWorked(int daysWorked) {
    this.daysWorked = daysWorked;
}
public int getDaysWorked() {
    return daysWorked;
}
public String toString() {
    String S="";
    S+="\n Hours Worked:"+hourWorked+"\n Days Worked:"+daysWorked;
    S+=super.toString();
    return S;
}
}
