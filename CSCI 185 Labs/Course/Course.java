/*
Guang Wei Too
Wenjia Li
Fall Semester CSCI 185
30 September 2021
*/
public class Course{
    public String courseName;
    private String courseNumber;
    public String instructorName;
    private Student[] listStudents;
    
   
    public Course(String name,String number, String instructor, Student[] listStudents){
        this.courseName=name;
        this.courseNumber=number;
        this.instructorName=instructor;
        this.listStudents= new Student[listStudents.length];
            for(int i = 0; i < listStudents.length; i++) {
                this.listStudents[i] = new Student(listStudents[i]);
            }
    }
    public Course(Course other){      
        if(other == null){            
            System.out.println("Invalid!");            
            System.exit(0);        
            }        
            this.courseName = other.courseName;        
            this.courseNumber=other.courseNumber;        
            this.instructorName=other.instructorName;
            this.listStudents=other.listStudents;   
        }
    public String getCourseName() {
        return courseName;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public String getCourseNumber() {
        return courseNumber;
    }
    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }
    public String getInstructorName() {
        return instructorName;
    }
    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }
	public void setStudents(Student[] alt_list) {
		this.listStudents = new Student[alt_list.length];
		
		for(int i = 0; i < alt_list.length; i++) {
			this.listStudents[i] = new Student(alt_list[i]);
		}
	}

    public Student[] getStudents() {
		
		Student[] temp = new Student[this.listStudents.length];
		
		for(int i = 0; i < temp.length; i++) {
			temp[i] = new Student(this.listStudents[i]);
		}
		
		return temp;
		
	}

    public String toString(){
    String output= "Course Info:\n\n"+ "\n Name:"+courseName+"\n Number:"+courseNumber+"\n Instructor:"+instructorName+"\n\n Students:\n\n";
    for(int i = 0; i < this.listStudents.length;i++) {
        output += "Student #" + (i+1) + ":\n" + this.listStudents[i].toString() + "\n\n";
   
   
    }
    
    return output;
    }
   
    public static void main(String[] args) {
        Student[] listProgramingStudents = new Student[3];
        listProgramingStudents[0] = new Student("Guang Wei Too", "21333787", 45.9,12);
        listProgramingStudents[1] = new Student("Joe Smith", "212238999", 68.2,12);
        listProgramingStudents[2] = new Student("Anthony Chen","215538589",80.9, 12);
    

        Student[] listPhysicsStudents = new Student[3];
        listPhysicsStudents[0]=new Student("Mark King", "2133553787", 90.6,12);
        listPhysicsStudents[1]=new Student("Daniel Didyk", "213443787", 90.9,12);
        listPhysicsStudents[2]=new Student("Johnathan Jay", "213666787", 65.8,12);
        

        Course Programing = new Course("Programming", "M02", "Wenjia Li", listProgramingStudents);
        Course Physics = new Course("Physics", "M02", "Jack Hugh", listPhysicsStudents);
        System.out.println(Programing);
        Physics.setInstructorName(("Amany Helal"));
        System.out.println(Physics);
    
    }
}
