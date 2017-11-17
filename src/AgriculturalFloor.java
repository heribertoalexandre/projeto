
public class  AgriculturalFloor extends Floor {

	//Attributes
	private int qtyPlants;
	public Plant plantation [] = new Plant [10];
	
	//Construct
	public AgriculturalFloor (int id,int capacity, double pressure, double temperature) {
		this.id = id;
		this.capacity = capacity;
		this.pressure = pressure;
		this.temperature = temperature;
	}
	
	//Getters and Setters
	public int getQtyPlants() {
		return qtyPlants;
	}
	public void setQtyPlants(int qtyPlants) {
		this.qtyPlants = qtyPlants;
	}

	public Plant[] getPlantation() {
		return plantation;
	}

	public void setPlantation(Plant[] plantation) {
		this.plantation = plantation;
	}

	//Methods
	public void toWater() {
		for(int cont = 0; cont < this.qtyPlants; cont++)
			plantation[cont].setWatered();
	}
	
	public void toFertilize () {
		for(int cont = 0; cont < this.qtyPlants; cont++)
			plantation[cont].setFertilized();
	}
	
	public void toPlant(String product,int amount) {
		for(int cont = this.qtyPlants; cont < this.qtyPlants + amount ; cont++) {
			plantation[cont] = new Plant (product);
		}
		
		this.setQtyPlants(this.getQtyPlants() + amount);
		this.setCapacity(this.getCapacity() - amount);
	}

	//toString
	public String toString() {
		return "AgriculturalFloor [qtyPlants = " + qtyPlants + ", id = " + id + ", capacity = " + capacity + ", pressure = "
				+ pressure + ", temperature = " + temperature + "]";
	}

	
	
	

	
	
}
