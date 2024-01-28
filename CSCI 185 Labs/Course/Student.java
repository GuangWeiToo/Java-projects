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
    public Student(Student other){      
        if(other == null){            
            System.out.println("Invalid!");            
            System.exit(0);        
            } 
            this.name=other.name;
            this.stu_id=other.stu_id;
            this.GPA=other.GPA;
            this.age= other.age;       
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

    }