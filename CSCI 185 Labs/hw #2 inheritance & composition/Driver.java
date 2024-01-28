/*
Guang Wei Too
Wenjia Li
CSCI-185
10/31/2021
Fall 2021
*/
public class Driver {
    public static void main(String[] args) {
        collegeStudent[] students1 = new collegeStudent[2];
        students1[0] = new collegeStudent("Travis Scott", "067-33-1484", true, 21, "1184743", 3.4, "Computer Science", "Sophomore");
        students1[1] = new collegeStudent("Drake Bell", "234-242-2342", true, 18, "1238143", 2.8, "Computer Engineering", "Freshman");


        Professor instructor1 = new Professor("Professor Sanchez", "235-72-2623", true, 21, "846483", 55000, 25, "Math",
                "Applied Analysis ", "Full ", true);

        Professor chair1 = new Professor("Professor Li", "013-93-1104", true, 51, "1184743", 55000, 25, "Math",
                "Numerical Analysis and Scientific Computing", "Full Professor", true);

        Professor[] faculty1 = new Professor[2];
        faculty1[0] = new Professor("Professor Boss", "968-07-1467", true, 30, "4242526", 53000, 5, "Math",
                " Analysis and Partial Differential Equations", " Professor", false);
        faculty1[1] = new Professor("Professor Boss", "853-57-2352", true, 28, "4242526", 53000, 3, "Math",
                "Mathematical Biology", " Professor", false);

        Course[] courses1 = new Course[1];
        courses1[0] = new Course("Calculus II\n", instructor1, students1);

        Department Engineering = new Department(chair1, faculty1, courses1);
        System.out.println(Engineering.toString());






        collegeStudent[] students2 = new collegeStudent[2];
        students2[0] = new collegeStudent("Josh Gomez", "522-42-2542", true, 24, "67294629", 1.5, "Bioengineering", "Sophomore");
        students2[1] = new collegeStudent("Jonathan Doe", "424-42-6432", true, 20, "1148425", 3.9, "Cyber Security", "Senior");

        Professor instructor2 = new Professor("Professor Chan", "175-92-3516", true, 26, "7736796", 35000, 2, "Physics",
                "Nanoscience and Nanotechnology", "Full ", false);

        Professor chair2 = new Professor("Professor Bob", "123-22-1215", true, 51, "1184743", 55000, 25, "Physics",
                "Biophysics", "Full Professor", true);

        Professor[] faculty2 = new Professor[2];
        faculty2[0] = new Professor("Professor Long", "132-64-8443", true, 55, "4415673", 30000, 30, "Physics",
                "Microfluidics and Microsystems", "Full Professor", true);
        faculty2[1] = new Professor("Professor Sanchez", "037-84-4128", true, 30, "1153784", 50000, 5, "Physics",
                "Energy Systems", "Full Professor", false);

        Course[] courses2 = new Course[1];
        courses2[0] = new Course("Modern Physics\n", instructor2, students2);

        Department Physics = new Department(chair2, faculty2, courses2);
        System.out.println(Physics.toString());
    }
}