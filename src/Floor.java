
public class Floor {


	//Attributes
	public int id;
	public int capacity;
	public double pressure;
	public double temperature;
	//Gase gases = new Gase();
	
	//Construct
	 public Floor(){} // No-argument Constructor
	
	//Getters and Setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public double getPressure() {
		return pressure;
	}
	public void setPressure(double pressure) {
		this.pressure = pressure;
	}
	public double getTemperature() {
		return temperature;
	}
	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

	//toString
	public String toString() {
		return "Floor [id=" + id + ", capacity=" + capacity + ", pressure=" + pressure + ", temperature=" + temperature
				+ "]";
	}
	

	
	
}


