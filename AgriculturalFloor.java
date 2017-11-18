import java.util.ArrayList;

public class  AgriculturalFloor extends Floor {

	//Attributes
	private int currentAmountOfPlants;
	private ArrayList <Plant> plantation = new ArrayList <Plant> ();
	
	//Construct
	public AgriculturalFloor (int id,int capacity, double pressure, double temperature) {
		this.id = id;
		this.capacity = capacity;
		this.pressure = pressure;
		this.temperature = temperature;
		this.currentAmountOfPlants = 0;
	}
	
	//Getters and Setters
	public int getCurrentAmountOfPlants() {
		return currentAmountOfPlants;
	}
	public void setCurrentAmountOfPlants() {
		this.currentAmountOfPlants = plantation.size();
	}
	
	//Methods
	public void toIrrigated() {
		for(int count = 0; count < plantation.size(); count++)
			plantation.get(count).setIsIrrigated();
	}
	
	public void toFertilize () {
		for(int count = 0; count < plantation.size(); count++)
			plantation.get(count).setFertilized();
	}
	
	public void toPlant(Plant plant, int x ) {
		
		int count = 0;
		boolean exhausted = false;
		do{
			if(this.currentAmountOfPlants + 1 <= this.capacity){
				plantation.add(plant);
				this.setCurrentAmountOfPlants();
				count++;
			}else
				exhausted = true;
		}while(count <= x &&  exhausted == false);
	}
	
	public int spoon() {
		int sumOfTheCrop = 0;
		for(int count = 0; count < plantation.size(); count++) {
			sumOfTheCrop += plantation.get(count).toBearFruit();
		}
		return sumOfTheCrop;
		
	}

	//toString
	public String toString() {
		return "AgriculturalFloor [Quantidades de plantas = " + currentAmountOfPlants + ", id = " + id + ", capacidade = " + capacity + ", pressão = "
				+ pressure + ", temperatura = " + temperature + "]";
	}

	
	
	

	
	
}
