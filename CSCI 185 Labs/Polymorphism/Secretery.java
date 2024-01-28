/*
Guang Wei Too
Wenjia Li
Programming ll
Fall 2021
21 October 2021
*/
public class Secretery extends Person {
    private String fac_id;
    private int num_service;

public Secretery(String n,String SSN, String Status, int age,String id,int service,int a, int y){
    super(n,SSN, Status,age,a,y);
    this.fac_id=id;
    this.num_service=service;
}
Secretery (Secretery other){
super(other.getName(),other.getSsn(),other.getStatus(),other.getAge(),other.getAnnual_salary(),other.getNum_vacation());
this.fac_id=other.fac_id;
this.num_service=other.num_service;

}
//Getpaid method
public void Paid(){
    System.out.println(getName()+" gets paid weekly");
}
//get vacation method
public void Vacation(){
    System.out.println(getName()+" gets 1 months off");
}
public void setFac_id(String fac_id) {
    this.fac_id = fac_id;
}
public String getFac_id() {
    return fac_id;
}
public void setNum_service(int num_service) {
    this.num_service = num_service;
}
public int getNum_service() {
    return num_service;
}

public String toString(){
    String S="";
    S+="\n FacID:"+fac_id+"\n People Served:"+num_service;
    S+=super.toString();
    return S;
}
}
