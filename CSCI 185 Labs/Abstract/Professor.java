/*
Guang Wei Too
Wenjia Li
CSCI-185
10/31/2021
Fall 2021
*/
public class Professor extends Employee {
    private double annualSalary;
    private int months;
    Professor(String n, String hire,double salary,int m){
        super(n,hire);
        this.annualSalary=salary;
        this.months=m;
        
    }
    Professor(Professor other){
    super(other.getName(),other.getHireDate());
    this.annualSalary=other.annualSalary;
    this.months=other.months;
    }
    public double getPay(){
        return (this.annualSalary/12);
    }
    public int getDaysOff(){
        return (this.months*8);
    }
    public double getAnnualSalary() {
        return annualSalary;
    }
    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }
    public double getMonths() {
        return months;
    }
    public void setMonths(int months) {
        this.months = months;
    }
    
    
    public String toString() {
        String S="";
        S+="\n Salary:"+annualSalary+"\n Months Worked:"+months;
        S+=super.toString();
        return S;
    }
    }

