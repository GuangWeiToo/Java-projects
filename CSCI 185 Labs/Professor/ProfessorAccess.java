public class ProfessorAccess {

    public static void main(String[] args) {
        Professor P1 = new Professor("Daniel Didyk","Economics",30000,2);
        Professor P2 = new Professor("Matthew Acevado","Music Theory",30000,8);
        Professor P3 = new Professor(P1);
       P1.setDepartment("Engineering");
       System.out.println(P2.getName());
        System.out.println(P1.toString());
        System.out.println(P2.toString());
        System.out.println(P3.toString());

    }   
}
