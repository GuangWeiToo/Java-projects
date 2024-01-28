public class Motorcycle {

    private String make_model;
    private int num_wheels;
    private double weight;

    public Motorcycle (int wheels,double weight, String model){ 
        this.make_model=model;
        this.num_wheels=wheels;
        this.weight=weight;

    }
    Motorcycle(){

    }
    public void setModel(String model){
        this.make_model = model;
        }
        public String getModel(){
            return "Model:"+this.make_model;
        }
        public void setWeight(double weight){
            this.weight=weight;
        }
        public String getWeight(){
            return "Weight:"+this.weight;
        }
        public void setWheels(int wheels){
            this.num_wheels=wheels;
        }
        public String getWheels(){
            return "Wheels:"+this.num_wheels;
        }
        
        
    public String toString(){
        return " Model:"+make_model+"\n Wheels:"+num_wheels+"\n Weight:"+weight;
    }

    public static void main(String[] args) {
        Motorcycle M1 = new Motorcycle(3,50 ,"black");
        Motorcycle M2 = new Motorcycle(2,30 ,"blue");
        Motorcycle M3 = new Motorcycle(2,10 ,"red");
        Motorcycle M4 = new Motorcycle();
        System.out.println(M1.toString());
        System.out.println(M2.getWeight());
        System.out.println(M3.getModel());
        System.out.println(M4.toString());
    } 

}