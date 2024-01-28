/*
Guang Wei Too
Wenjia Li
CSCI-185
10/31/2021
Fall 2021
*/
//derived Class
public class collegeStudent extends Student {
    private String major, grade;

    //constructor
    public collegeStudent(String n, String SSN, boolean alive, int age, String id, double gpa, String m, String g) {
        super(n, SSN, alive, age, id, gpa);
        this.major = m;
        this.grade = g;
    }


        //copy constructor
        public collegeStudent(collegeStudent cs) {
            super(cs.getName(), cs.getSsn(), cs.getalive(), cs.getAge(), cs.getID(), cs.getGPA());
            this.major = cs.major;
            this.grade = cs.grade;

        }

        // set/get method

        public String getMajor () {
            return major;

        }
        public String getGrade () {
            return grade;
        }

        //toString
        public String toString () {
            String S = "";
            S += super.toString();
            S += "\nMajor:" + major + "\nGrade:" + grade;

            return S;
        }
    }