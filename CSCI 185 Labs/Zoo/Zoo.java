

public class Zoo {
	
	//data
	private String name;
	private double revenue;
	private Animal[] list;
	
	//constructor
	public Zoo(String n, double r, Animal[] list) {
		this.name = n;
		this.revenue = r;
		
		//CHALLENGING part!
		this.list = new Animal[list.length];
		
		for(int i = 0; i < list.length; i++) {
			this.list[i] = new Animal(list[i]);
		}
	}
	
	//set/get for list of animals
	public void setAnimals(Animal[] alt_list) {
		this.list = new Animal[alt_list.length];
		
		for(int i = 0; i < alt_list.length; i++) {
			this.list[i] = new Animal(alt_list[i]);
		}
	}
	
	public Animal[] getAnimals() {
		//return this.list - DANGEROUS!!!
		
		Animal[] temp = new Animal[this.list.length];
		
		for(int i = 0; i < temp.length; i++) {
			temp[i] = new Animal(this.list[i]);
		}
		
		return temp;
		
	}
	
	//toString
	public String toString() {
		String output = "Zoo Info:\n\n" + "Name: " + this.name + "\nRevenue: " + this.revenue + "\n\nList of Animals:\n\n";
		
		for(int i = 0; i < this.list.length;i++) {
			output += "Animal #" + (i+1) + ":\n" + this.list[i].toString() + "\n\n";
		}
		
		return output;
	}

	public static void main(String[] args) {
		
		
		Animal[] list = new Animal[3];
		
		list[0] = new Animal("Monkey", 5, 45.9);
		list[1] = new Animal("Giant Panda", 21, 268.2);
		list[2] = new Animal("Asian Eleplant", 8, 3561.5);
		
		Zoo bronx_zoo = new Zoo("Bronx Zoo", 434253432.19, list);
		
		System.out.println(bronx_zoo.toString());
		
	}

}
