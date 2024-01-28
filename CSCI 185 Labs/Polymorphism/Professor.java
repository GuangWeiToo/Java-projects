/*
Guang Wei Too
Wenjia Li
Programming ll
Fall 2021
21 October 2021
*/
public class Professor extends Person{
    private String fac_id,research_area;
    private int year_in_profession;

    public Professor(String n,String SSN,String Status,int age,int a,int y,String facid, String r,int year){
        super(n,SSN,Status,age,a,y);
        this.fac_id=facid;
        this.research_area= r;
        this.year_in_profession=year;
       

    }
    //copy
    public Professor (Professor other){
        super(other.getName(),other.getSsn(),other.getStatus(),other.getAge(),other.getAnnual_salary(),other.getNum_vacation());
        this.fac_id= other.fac_id;
        this.research_area= other.research_area;
        this.year_in_profession=other.year_in_profession;

    }
//Getpaid method
public void Paid(){
 System.out.println(getName()+" gets paid monthly");
}
//get vacation method
public void Vacation(){
	System.out.println(getName()+" gets 3 months off");
}
    // get/set
    public void setID(String n){
    this.fac_id = n;
    }
    public String getID(){
    return "ID:"+this.fac_id;
    }
    public void setResearch(String d){
    this.research_area = d;
    }
    public String getResearch(){
    return "Research Area:"+this.research_area;
    }
      
    public String toString(){
        String S="";
        S+="\n FacID:"+fac_id+"\n Research Area:"+research_area+"\n Year in Profession:"+year_in_profession;
        S+=super.toString();
        return S;
    }

}