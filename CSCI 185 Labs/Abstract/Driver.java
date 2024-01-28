/*
Guang Wei Too
Wenjia Li
CSCI-185
10/31/2021
Fall 2021
*/
public class Driver {
     public static void main(String[] args) {
        TA ta1 = new TA ("Daniel Didyk","10-15-2021",4.5,20);
        TA ta2 = new TA("Matthew White", "07-28-2021", 4.5, 10);
        Professor p1 = new Professor("Joe Smith","10-15-2021",48000,1);
        Professor p2 = new Professor("Jack Hunts","07-20-2018",42000,36);
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(ta1.toString());
        System.out.println(ta2.toString());
        System.out.println("Do Daniel and Joe have same pay? " + ta1.samePay(p1));
        System.out.println("Do Daniel and Joe have same days off? " + ta1.sameDaysOff(p1));
        System.out.println("Do Daniel and Matthew have same pay? " + ta2.samePay(ta1));
        System.out.println("Do Daniel and Matthew have same days off? " + ta1.sameDaysOff(ta2));
        System.out.println("Do Jack and Joe have same pay? " + p1.samePay(p2));
        System.out.println("Do Jack and Joe have same days off? " + p2.sameDaysOff(p1));
    }
}

