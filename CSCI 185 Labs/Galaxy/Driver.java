public class Driver {
    public static void main(String[] args) {
        Star[] s= new Star[3];
         s[0]= new Star("Solar",60,100000,30000000,"Red Giant");
         s[1]= new Star("Solar",60,100000,30000000,"Red Giant");
         s[2]= new Star("Solar",60,100000,30000000,"Neutron");
         Galaxy Milky = new Galaxy(3,"Milky Way Galaxy",100000,s);
         System.out.println(Milky.toString());
       
    }
}
