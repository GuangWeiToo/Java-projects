public class It_company{
    private String  name,headquarters;
    private double revenue;
    private SoftwareEngineer[] list_employee;
It_company(){

}
It_company(String n,String hq, double r,SoftwareEngineer[]e){
this.name=n;
this.headquarters=hq;
this.revenue=r;
this.list_employee=new SoftwareEngineer[e.length];
for (int i=0;i<e.length;i++){
this.list_employee[i]=new SoftwareEngineer(e[i]);
}
}
It_company(It_company other){
    if(other== null){
        System.out.println("invalid!");
        System.exit(0);
    }
    this.name=other.name;
    this.headquarters=other.headquarters;
    this.revenue=other.revenue;
    this.list_employee= other.list_employee;
}
public void setHeadquarters(String headquarters) {
    this.headquarters = headquarters;
}
public String getHeadquarters() {
    return headquarters;
}
public void setRevenue(double revenue) {
    this.revenue = revenue;
}
public double getRevenue() {
    return revenue;
}
public void setemployees(SoftwareEngineer[] e){
    this.list_employee = new SoftwareEngineer[e.length];
    for (int i=0; i<e.length;i++){
        this.list_employee[i]=new SoftwareEngineer(e[i]);
    }
} 
public SoftwareEngineer[] getEmployees() {
		
    SoftwareEngineer[] temp = new SoftwareEngineer[this.list_employee.length];
    
    for(int j = 0; j < temp.length; j++) {
        temp[j] = new SoftwareEngineer(this.list_employee[j]);
    }
    
    return temp;
    
}
public String toString(){
 String output="\n Headquarter Info:";
 output+="Company name"+this.name+ "\n HQ:"+headquarters+"\n Revenue:"+revenue+"\n list employee:";
 for (int k=0; k<list_employee.length;k++){
    output += "\n Employee #" + (k+1) + ":\n" + this.list_employee[k].toString() + "\n\n";
 }
 return output;
}
}