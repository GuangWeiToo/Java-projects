/*
Guang Wei Too
Wenjia Li
CSCI-185
10/31/2021
Fall 2021
*/
//derived Class
public class Student extends Person{

    //data
    private String stu_id;
    private double GPA;

    //constructor
    Student(String n, String SSN,boolean alive, int age,String id,double gpa){
        super(n,SSN,alive,age);
        this.stu_id = id;
        this.GPA = gpa;
    }
    //copy constructor
    public Student(Student other){
        super(other.getName(),other.getSsn(),other.getalive(),other.getAge());
        this.stu_id = other.stu_id;
        this.GPA = other.GPA;

    }


    //Set/Get methods
    public String getID(){
        return this.stu_id;
    }

    public double getGPA(){
        return this.GPA;
    }

    //toString
    public String toString(){
        String S = "";
        S += super.toString();
        S += "\nStudentID:"+ stu_id+"\nGPA:"+ GPA ;

        return S;
    }

}