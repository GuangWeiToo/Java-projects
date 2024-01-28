/*
Guang Wei Too
Wenjia Li
Programming ll
Fall 2021
21 October 2021
*/
public class Student_Worker extends Person{
   private String ta_id,year,course_taught;
   
public Student_Worker(String n,String SSN,String Status,int age,int a, int y,String id,String year,String taught){
    super(n,SSN,Status,age,a,y);
    this.ta_id=id;
    this.year=year;
    this.course_taught=taught;

}
Student_Worker(Student_Worker other){
super(other.getName(),other.getSsn(),other.getStatus(),other.getAge(),other.getAnnual_salary(),other.getNum_vacation());
this.ta_id=other.ta_id;
this.year=other.year;
this.course_taught=other.course_taught;
} 
//Getpaid method
public void Paid(){
    System.out.println(getName()+" gets paid hourly");
}
//get vacation method
public void Vacation(){
    System.out.println(getName()+" gets weekend off");
}
public void setTa_id(String ta_id) {
    this.ta_id = ta_id;
}
public String getTa_id() {
    return ta_id;
}
public void setYear(String year) {
    this.year = year;
}
public String getYear() {
    return year;
}
public void setCourse_taught(String course_taught) {
    this.course_taught = course_taught;
}
public String getCourse_taught() {
    return course_taught;
}

public String toString(){
    String S="";
    S+="\n TaID:"+ta_id+"\n Year:"+year+"\n Course Taught:"+course_taught;
    S+=super.toString();
    return S;
}
}
