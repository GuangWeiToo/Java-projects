/*
Guang Wei Too
Wenjia Li
Programming ll
Fall 2021
21 October 2021
*/
public class Person {

	//data
	private String name,ssn,status;
	private int age,annual_salary,num_vacation;


Person(String n,String SSN,String Status,int age,int a,int y){
this.name=n;
this.ssn=SSN;
this.status=Status;
this.age=age;
if(Status=="true"){
	status="Alive";
	}else{
	status="Dead";
	}
this.annual_salary=a;
this.num_vacation=y;
}
//copy
public Person(Person other){
	this.name= other.name;
	this.ssn= other.ssn;
	this.status=other.status;
	this.age=other.age;
	this.annual_salary=other.annual_salary;
	this.num_vacation=other.num_vacation;
}
//Getpaid method
public void Paid(){
	System.out.println("gets paid");
}
//get vacation method
public void Vacation(){
	System.out.println("gets vacation");
}
// get/set
public void setAge(int age) {
	this.age = age;
}
public int getAge() {
	return age;
}
public void setName(String name) {
	this.name = name;
}
public String getName() {
	return name;
}
public void setSsn(String ssn) {
	this.ssn = ssn;
}
public String getSsn() {
	return ssn;
}
public void setStatus(String status) {
	this.status = status;
}
public String getStatus() {
	return status;
}
public void setAnnual_salary(int annual_salary) {
	this.annual_salary = annual_salary;
}
public int getAnnual_salary() {
	return annual_salary;
}
public void setNum_vacation(int num_vacation) {
	this.num_vacation = num_vacation;
}
public int getNum_vacation() {
	return num_vacation;
} 
// toString
public String toString() {
	
	return "\n Person Info:"+ "\n Name:"+name+"\n SSN:"+ssn+"\n Status:"+status+"\n Age:"+age+"\n Annual Salary:"+annual_salary+"\n Vacation Taken:"+num_vacation;
}
}
