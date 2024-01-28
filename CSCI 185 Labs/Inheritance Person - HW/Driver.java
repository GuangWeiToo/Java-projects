/*
Guang Wei Too
Computer Programming ll Fall Semester
Wenjia Li
12 October 2021
*/
public class Driver {
    public static void main(String[] args) {
        Student[] S= new Student[5];
        Teacher[] T= new Teacher[3];
        Student[] S1= new Student[5];
        Teacher[] T1= new Teacher[3];

        S[0] = new Student("Jason Smith","1234567890",21,true,"123234",3.15,"Freshman");
        S[1] = new Student("Sandi Alah","4565879007",21,true,"123234",3.50,"Senior");
        S[2] = new Student("Guang Wei","3213243568",21,true,"123234",2.98,"Senior");
        S[3] = new Student("Max White","5432432535",21,true,"123234",3.10,"Freshman");
        S[4] = new Student("Henry Too","2333322357",21,true,"123234",3.00,"Junior");
        T[0] =new Teacher("Morris George","5354256475", 30, true,"234444", 40000, 5);
        T[1] =new Teacher("Brian Hugman", "6521778878", 78, true, "817443", 40000, 11);
        T[2] =new Teacher("Wenjia Li", "1514443211", 39, true, "817443", 40000, 8);

        S1[0] = new Student("Jason Smith","1234567890",21,true,"123234",3.15,"Freshman");
        S1[1] = new Student("Sandi Alah","4565879007",21,true,"123234",3.50,"Senior");
        S1[2] = new Student("Guang Wei","3213243568",21,true,"123234",2.98,"Senior");
        S1[3] = new Student("Max White","5432432535",21,true,"123234",3.10,"Freshman");
        S1[4] = new Student("Henry Too","2333322357",21,true,"123234",3.00,"Junior");
        T1[0] =new Teacher("Morris George","5354256475", 30, true,"234444", 40000, 5);
        T1[1] =new Teacher("Brian Hugman", "6521778878", 78, true, "817443", 40000, 11);
        T1[2] =new Teacher("Wenjia Li", "1514443211", 39, true, "817443", 40000, 8);
        Department ComputerScience= new Department("Computer Science",8,T,S);
        Department Engineering= new Department("Engineering",8,T1,S1);
        System.out.println(ComputerScience.toString());
        System.out.println(Engineering.toString());
    }
}
