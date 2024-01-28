/*
Guang Wei Too
Computer Programming ll Fall Semester
Wenjia Li
12 October 2021
*/
public class Person {

	//data
	private String name, SSN;
	private int age;
	private boolean alive;
	
	//constructors
	public Person(String n, String ssn, int a,Boolean aliveBoolean){
	this.name= n;
	this.SSN= ssn;
	this.age= a;
	this.alive= aliveBoolean;
	}
	public Person(Person p){
		if (p==null){
			System.out.println("invalid person");
			System.exit(0);
		}
		this.name= p.name;
		this.SSN= p.SSN;
		this.age= p.age;
		this.alive=p.alive;
	}
	
	public Person (String ssn) {
	this.SSN= ssn;
	}
	//accessor and mutator methods
	public void setName(String n){
		this.name = n;
	}
	public String getName(){
		return this.name;
	}
	public void setSSN(String ssn){
		this.SSN=ssn;
	}
	public String getSSN(){
		return this.SSN;
	}
	public void setAge(int a){
		this.age=a;
	}
	public int getAge(){
		return this.age;
	}
	public void setAlive(boolean alive) {
		this.alive = alive;
	}
	public boolean getAlive(){
		return this.alive;
	}
	
	//toString
	public String toString () {
	return "\n Person Info:" + "\n Name:" +this.name +"\n SSN:" +this.SSN +"\n Age:" +this.age +"\n Is Alive:"+ this.alive;
	/*if (alive==true){
		return "Alive";
	} else{
		return "Deceased";
	}


	/*public static void main (String[] args) {
		Person joe =new Person ("Joe", "987-654-3218" ,31);
		Person jack =new Person ("111-222-3333");
	
		System.out.println(joe.toString());
		System.out.println(jack.toString());
	
}*/
}}

