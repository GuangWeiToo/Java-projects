public class Person {

	//data
	private String name, SSN;
	private int age;
	
	//constructors
	public Person(String n, String ssn, int a){
	this.name= n;
	this.SSN= ssn;
	this.age= a;
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
	
	//toString
	public String toString () {
	return "Person Info" + "\nName" +name +"\nSSN" +SSN +"\nAge" +age;
	}

	public static void main (String[] args) {
		Person joe =new Person ("Joe", "987-654-3218" ,31);
		Person jack =new Person ("111-222-3333");
	
		System.out.println(joe.toString());
		System.out.println(jack.toString());
	
}
}
