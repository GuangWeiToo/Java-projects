public class Research_Scientist{
    private String name, specialty;
    private int years_exp;

Research_Scientist(String name,int experience,String specialty){
    this.name=name;
    this.specialty=specialty;
    this.years_exp=experience;
}
Research_Scientist(Research_Scientist other){
    this.name=other.name;
    this.years_exp=other.years_exp;
    this.specialty=other.specialty;
}
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public String getSpecialty() {
    return specialty;
}
public void setSpecialty(String specialty) {
    this.specialty = specialty;
}
public int getYears_exp() {
    return years_exp;
}
public void setYears_exp(int years_exp) {
    this.years_exp = years_exp;
}
public String toString() {
    return " Name:"+name+"\n Years of Experience:"+years_exp+"\n Specialty:"+specialty;
}
public static void main(String[] args) {
    Research_Scientist henry= new Research_Scientist("Henry",12,"Programming");
    System.out.println(henry.toString());
}
}