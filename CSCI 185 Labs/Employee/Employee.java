public class Employee{

private String name, hire_date;
private int age;

Employee(){
    
}
Employee(String n,String d,int a){
    this.name=n;
    this.hire_date=d;
    this.age=a;
}
Employee(Employee other){
    if(other==null){
        System.out.println("invalid");
        System.exit(0);
    }
    this.name= other.name;
    this.hire_date=other.hire_date;
    this.age=other.age;
}
public int getAge() {
    return age;
}
public void setAge(int age) {
    this.age = age;
}
public String getHire_date() {
    return hire_date;
}public void setHire_date(String hire_date) {
    this.hire_date = hire_date;
}
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public String toString(){
    return "\n Employee info:"+ "\n Name:"+ name+"\n Hired Date:"+hire_date+"\n Age:"+age;
}
}