public class Driver {
    public static void main(String[] args) {
        SoftwareEngineer Josh = new SoftwareEngineer("Josh K","Jun-12-2020",26,26000,"Python,Java");
        System.out.println(Josh.toString());
        SoftwareEngineer[] unicorn =new SoftwareEngineer[3];
        unicorn[0]= new SoftwareEngineer("Josh K","Jun-12-2020",26,26000,"Python,Java");
        unicorn[1]= new SoftwareEngineer("Josh K","Jun-12-2020",26,26000,"Python,Java");
        unicorn[2]= new SoftwareEngineer("Josh K","Jun-12-2020",26,26000,"Python,Java");
        It_company Unicorn = new It_company("Unicorn","Washington",3000000,unicorn);
        System.out.println(Unicorn.toString());

    }
}
