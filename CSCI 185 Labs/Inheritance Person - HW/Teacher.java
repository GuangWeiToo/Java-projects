public class Teacher extends Person {
    private String ID;
    private int salary;
    private int num_yr_prof;
Teacher(String name,String SSN, int age,boolean al,String id,int salary,int yr_num){
    super(name,SSN,age,al);
    this.ID= id;
    this.salary=salary;
    this.num_yr_prof=yr_num;
}
Teacher(Teacher T){
    super(T.getName(),T.getSSN(),T.getAge(),T.getAlive());
    this.ID= T.ID;
    this.salary=T.salary;
    this.num_yr_prof= T.num_yr_prof;
}
public void setID(String iD) {
    this.ID = iD;
}
public String getID() {
    return ID;
}
public void setSalary(int salary) {
    this.salary = salary;
}
public int getSalary() {
    return salary;
}public void setNum_yr_prof(int num_yr_prof) {
    this.num_yr_prof = num_yr_prof;
}
public int getNum_yr_prof() {
    return num_yr_prof;
}
public String toString(){
    String T="";
    T += "\n Teacher Info:" +"\n TeacherID:"+ ID+"\n Salary:"+salary +"\n Years in Profession:"+num_yr_prof ;
    T += super.toString();
    return T;
}
}
