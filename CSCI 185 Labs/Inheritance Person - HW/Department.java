/*
Guang Wei Too
Computer Programming ll Fall Semester
Wenjia Li
12 October 2021
*/
public class Department {
    private String deptName;
    private int numMajor;
    private Teacher[] listTeachers;
    private Student[] listStudents;
public Department(){

}
public Department(String Name, int num, Teacher[]listTeachers,Student[]listStudents){
this.deptName=Name;
this.numMajor=num;
this.listStudents= new Student[listStudents.length];
for(int j=0;j<listStudents.length;j++){
    this.listStudents[j]=new Student(listStudents[j]);
}
this.listTeachers= new Teacher[listTeachers.length];
for(int i= 0;i<listTeachers.length;i++)
    this.listTeachers[i]=new Teacher(listTeachers[i]);
}
public String getDeptName() {
    return deptName;
}
public void setDeptName(String deptName) {
    this.deptName = deptName;
}
public int getNumMajor() {
    return numMajor;
}
public void setNumMajor(int numMajor) {
    this.numMajor = numMajor;
}

public Student[] getStudents() {
   Student[] temp= new Student[this.listStudents.length];
    for(int j=0; j<temp.length;j++){
        temp[j]=new Student(this.listStudents[j]);
    }
    return temp;
}
public Teacher[] getTeachers() {
    Teacher[] temp= new Teacher[this.listTeachers.length];
     for(int i=0; i<temp.length;i++){
         temp[i]=new Teacher(this.listTeachers[i]);
     }
     return temp;
 }
public String toString(){
String output="\n Department Info:"+deptName+"\n Number of Majors:"+numMajor;
for(int j = 0; j < this.listStudents.length;j++) {
    output += "\n\n Student #" + (j+1) + ":\n" + this.listStudents[j].toString() + "\n\n";
} 
for(int i = 0; i < this.listTeachers.length;i++) {
    output += "\n\n Teacher #" + (i+1) + ":\n" + this.listTeachers[i].toString() + "\n\n";
} 
return output;

}
}
