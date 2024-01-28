/*
Guang Wei Too
Computer Programming ll Fall Semester
Wenjia Li
12 October 2021
*/
class Student extends Person{
    private String stu_id;
    private double GPA;
    private String Grade;
    
    
public Student(String name, String SSN, int age,boolean al, String id, double gpa,String grade){
    super(name,SSN,age,al);
    this.stu_id= id;
    this.GPA=gpa;
    this.Grade= grade;
   
    }
    Student(Student S){
    super(S.getName(),S.getSSN(),S.getAge(),S.getAlive());
    this.GPA= S.GPA;
    this.stu_id=S.stu_id;
    this.Grade=S.Grade;
    } 
    //Set/Get methods

      
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
       public void setGrade(String grade) {
           this.Grade = grade;
       }
       public String getGrade() {
           return Grade;
       }
        
        public String toString(){
            String S="";
            S += "\n Student Info:" +"\n StudentID:"+ stu_id+"\n GPA:"+ GPA ;
            S += super.toString();
            return S;
        }
        
}
