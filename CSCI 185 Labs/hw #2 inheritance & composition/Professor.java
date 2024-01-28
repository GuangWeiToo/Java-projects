/*
Guang Wei Too
Wenjia Li
CSCI-185
10/31/2021
Fall 2021
*/
//derived Class
public class Professor extends Teacher {

    //data
    private String specialty;
    private String research_area;
    private String rank;
    private boolean tenured;

    //constructor
    public Professor(String name,String SSN, boolean alive, int age,String id,int salary,int yr_num, String specialty,
                     String research_area, String rank, boolean tenured){
        super( name,SSN,alive,age, id, salary, yr_num);
        this.specialty = specialty;
        this.research_area = research_area;
        this.rank = rank;
        this.tenured = tenured;
    }

    //copy constructor
    public Professor(Professor p){
        super(p.getName(), p.getSsn(), p.getalive(), p.getAge(), p.getID(), p.getSalary(), p.getNum_yr_prof());
        this.specialty = p.specialty;
        this.research_area = p.research_area;
        this.rank = p.rank;
        this.tenured = p.tenured;
    }

    // set/get method
    public void setSpecialty(String specialty){
        this.specialty = specialty;
    }

    public String getSpecialty(){
        return this.specialty;
    }

    public void setResearch_area(String research_area) {
        this.research_area = research_area;
    }

    public String getResearch_area() {
        return this.research_area;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getRank(){
        return this.rank;
    }

    public void setTenured(boolean Tenured){
        this.tenured = Tenured;
    }

    public boolean getTenured(){
        return this.tenured;
    }

    //toString
    public String toString(){
        return super.toString() + "\nSpecialty: " + this.specialty + "\nResearch Area: "
                + this.research_area + "\nRank:" + this.rank + "\nTenured: " + this.tenured + "\n";
    }

}