
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
	
	public void toPlant(Plant plant, int x ) {
		
		int atual = this.qtyPlants;
		int cont = 0;
		boolean exhausted = false;
		
		do{
			if(this.qtyPlants + 1 <= this.capacity){
				plantation[qtyPlants] = plant;
				this.setQtyPlants(this.qtyPlants + 1);
				cont++;
			}else
				exhausted = true;
			
		}while(cont <= x &&  exhausted == false);
	}

	//toString
	public String toString() {
		return "AgriculturalFloor [qtyPlants = " + qtyPlants + ", id = " + id + ", capacity = " + capacity + ", pressure = "
				+ pressure + ", temperature = " + temperature + "]";
	}

	
	
	

	
	
}
