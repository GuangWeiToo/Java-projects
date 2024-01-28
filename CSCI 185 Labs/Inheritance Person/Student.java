class Student extends Person{
    private String name,stu_id;
    private double GPA;
    
    
public Student(String name, String SSN, int age, String id, double gpa){
    super(name,SSN,age);
    this.stu_id= id;
    this.GPA=gpa;
   
    }
    Student(Student S){
    super(S.getName(),S.getSSN(),S.getAge());
    this.GPA= S.GPA;
    this.stu_id=S.stu_id;
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
       
        
        public String toString(){
            String S="";
            S += "Student Info:" +"\n StudentID:"+ stu_id+"\n GPA:"+ GPA ;
            S += super.toString();
            return S;
        }
        public static void main(String[] args) {
            Student S1 = new Student("Henry","123456789",21,"123234",3.98);
            System.out.println(S1.toString());
        }
}
