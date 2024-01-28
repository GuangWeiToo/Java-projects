/*
Guang Wei Too
Wenjia Li
CSCI-185
10/31/2021
Fall 2021
*/
public class Course {
    private String course_name;
    private Professor instructor;
    private collegeStudent[] students;

    // constructor
    public Course(String course, Professor instructor, collegeStudent[] cs) {
        this.course_name = course;
        this.instructor = instructor;

        this.students = new collegeStudent[cs.length];
        for (int i = 0; i < cs.length; i++) {
            this.students[i] = new collegeStudent(cs[i]);
        }
    }

    public Course(Course c) {
        this.course_name = c.course_name;
        this.instructor = c.instructor;
        this.students = c.students;
    }

    //set/get method
    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public String getCourse_name() {
        return this.course_name;
    }

    public void setInstructor(Professor instructor) {
        this.instructor = instructor;
    }

    public Professor getInstructor() {
        return this.instructor;
    }

    public void setStudents(collegeStudent[] cs1) {
        this.students = new collegeStudent[cs1.length];
        for (int i = 0; i < cs1.length; i++) {
            this.students[i] = new collegeStudent(cs1[i]);
        }
        }

    public collegeStudent[] getStudents(){
        collegeStudent[] temp = new collegeStudent[this.students.length];
        for(int i = 0; i < temp.length; i++){
            temp[i] = new collegeStudent(this.students[i]);
        }
        return temp;
    }

    public String toString(){
        String out = "Course Information:\n\n ";
        out += "Course Name:" + this.course_name + "\nInstructor: " + this.instructor + "\n\nList of Students:\n ";

        for(int i = 0; i < students.length; i++){
            out += "\n\nStudent #" + (i + 1) + ":" + this.students[i].toString();
        }
        return out;
    }
}