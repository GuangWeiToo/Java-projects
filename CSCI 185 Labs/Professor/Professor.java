public class Professor{
    private String name,department;
    private double annual_salary;
    private int year_in_profession;

    public Professor(String n, String d,double a,int y){
        this.name=n;
        this.department= d;
        this.annual_salary=a;
        this.year_in_profession=y;


    }
    Professor(){

    }
    //copy
    public Professor (Professor other){
        this.name= other.name;
        this.department= other.department;
        this.annual_salary=other.annual_salary;
        this.year_in_profession=other.year_in_profession;
    }
        public void setName(String n){
        this.name = n;
        }
        public String getName(){
            return "Name:"+this.name;
        }
        public void setDepartment(String d){
            this.department = d;
            }
            public String getDepartment(){
                return "Department:"+this.department;
            }
        public void setWeight(double a){
            this.annual_salary=a;
        }
        public String getWeight(){
            return "Annual Salary:"+this.annual_salary;
        }
        public void setYears(int y){
            this.year_in_profession=y;
        }
        public String getYears(){
            return "Years in Profession:"+this.year_in_profession;
        }
    public String toString(){
        return "\nName:"+name+"\nDepartment:"+department+"\nAnnual Salary:"+annual_salary+"\nYear in Profession:"+year_in_profession;
    }

}