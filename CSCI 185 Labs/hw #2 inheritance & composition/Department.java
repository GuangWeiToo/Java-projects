/*
Guang Wei Too
Wenjia Li
CSCI-185
10/31/2021
Fall 2021
*/
public class Department {
    private Professor chair;
    private Professor[] faculty;
    private Course[] courses;

    // constructor
    public Department(Professor chair, Professor[] f, Course[] c) {
        this.chair = chair;

        this.faculty = new Professor[f.length];
        for (int j = 0; j < f.length; j++) {
            this.faculty[j] = new Professor(f[j]);
        }

        this.courses = new Course[c.length];
        for (int i = 0; i < c.length; i++) {
            this.courses[i] = new Course(c[i]);
        }
    }



    //set/get method
    public void setChair(Professor chair) {
        this.chair = chair;
    }

    public Professor getChair() {
        return this.chair;
    }

    public void setFaculty(Professor[] p1) {
        this.faculty = new Professor[p1.length];
        for (int j = 0; j < p1.length; j++) {
            this.faculty[j] = new Professor(p1[j]);
        }
    }

    public Professor[] getFaculty() {
        Professor[] temp = new Professor[this.faculty.length];
        for (int j = 0; j < temp.length; j++) {
            temp[j] = new Professor(this.faculty[j]);
        }
        return temp;
    }

    public void setCourses(Course[] c1) {
        this.courses = new Course[c1.length];
        for (int i = 0; i < c1.length; i++) {
            this.courses[i] = new Course(c1[i]);
        }
    }

    public Course[] getCourses() {
        Course[] alt = new Course[this.courses.length];
        for (int i = 0; i < alt.length; i++) {
            alt[i] = new Course(this.courses[i]);
        }
        return alt;
    }

    public String toString() {
        String out = "\n\nDepartment Information:\n\n";
        out += "Department chair: " + this.chair + "\n\nList of Faculty:\n";

        for (int j = 0; j < this.faculty.length; j++) {
            out += "\nFaculty #" + (j + 1) + ":\n" + this.faculty[j].toString();
        }

        out += "\nList of Courses:";
        for (int i = 0; i < this.courses.length; i++) {
            out += "\n\nCourse #" + (i + 1) + ":\n" + this.courses[i].toString();
        }
        return out;
    }
}