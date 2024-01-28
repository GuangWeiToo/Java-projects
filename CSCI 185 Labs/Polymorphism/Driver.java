/*
Guang Wei Too
Wenjia Li
Programming ll
Fall 2021
21 October 2021
*/
public class Driver{
    public void paidAndVacation(Person p){
        p.Paid();
        p.Vacation();
    }
    public static void main(String[] args) {
       Professor P1 =new Professor("Joe Smith","764476586329","true",45,30000,3,"3214-432-54525", "Cyber Security",8);
       Student_Worker Ta1= new Student_Worker("Daniel Didyk","476761354382","true",21,5000, 6,"3763-454-76592","Senior","programming");
       Secretery S1= new Secretery("Jacky White","674318147438","true",29,"3487-476-98764",8,25000,3);
       Driver d =new Driver();
       System.out.println(P1.toString());
      d.paidAndVacation(P1);
       System.out.println(Ta1.toString());
      d.paidAndVacation(Ta1);
       System.out.println(S1.toString());
      d.paidAndVacation(S1);
    }
}