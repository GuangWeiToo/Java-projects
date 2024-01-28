/*
CSCI 185
Fall 2021
Lab 2 Visibility Modifiers and Set/Get Methods Lab
Guang Wei TOo
21 September 2021
*/

public class Student{
private String name,stu_id;
private double GPA;
private int age;

Student(String name, String id, double gpa, int age){
this.name= name;
this.stu_id= id;
this.GPA=gpa;
this.age=age;
}
Student(){

}
//Set/Get methods
    public void setName(String name){
    this.name = name;
    }
    public String getName(){
        return "Name:"+this.name;
    }
    public void setID(String id){
        this.stu_id=id;
    }
    public String getID(){
        return "ID:"+this.stu_id;
    }
    public void setGPA(double gpa){
        this.GPA=gpa;
    }
    public String getGPA(){
        return "GPA:"+this.GPA;
    }
    public void setAge(int age){
        this.age=age;
    }
    public String getAge(){
        return "Age:"+this.age;
    }
    
    public String toString(){
        return "Student Info:" +"\n Name:"+ name+"\n StudentID:"+ stu_id+"\n GPA:"+ GPA +"\n Age:"+age;
    }
     public static void main(String[] args) {
        Student S1 = new Student("Joshua Ramos", "215335878",0.88,12 );
        Student S2 = new Student("Jack Lin", "299837013",065,12 );
        Student S3 = new Student("George Branch", "213338589",0.90,12 );
        System.out.println(S1.toString());
        System.out.println(S2.getAge());
        System.out.println(S3.getID());
    }
}