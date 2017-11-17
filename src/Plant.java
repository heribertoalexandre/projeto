import java.util.Random;

public class Plant {
	
	//Attributes
	private String productName = new String();
	private String stageOfLife = new String();
	private int timeOfLife; // 1 until 10
	private boolean  watered;
	private boolean  ripe; // not necessary
	private boolean fertilized;
	private boolean alive;
	
	//Construct
	public Plant(String productName) {
		this.productName = productName;
		this.stageOfLife = "broto";
		this.timeOfLife = 1;
		this.watered = false;
		this.ripe = false;
		this.fertilized = false;
		this.alive = true;
	}
	
	//Getters and Setters
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getStageOfLife() {	
		return this.stageOfLife;
	}
	private void setStageOfLife() {
		String stages[] = {"Germinação","Broto","Planta","Maturação","Morta"};
		int actualStage = this.timeOfLife / 2;
		this.stageOfLife = stages[actualStage];	
	}
	public int getTimeOfLife() {
		return timeOfLife;
	}
	public void setTimeOfLife() {
		++this.timeOfLife;
		if(this.timeOfLife == 10)
			this.setAlive();
		this.setStageOfLife();
	}
	public boolean isWatered() {
		return watered;
	}
	public void setWatered() {
		this.watered = !watered;
	}
	public boolean isRipe() {
		return ripe;
	}
	public void setRipe() {
		this.ripe = !ripe;
	}
	public boolean isFertilized() {
		return fertilized;
	}
	public void setFertilized() {
		this.fertilized = !fertilized;
	}
	public boolean isAlive() {
		return alive;
	}
	private void setAlive() {
		this.alive = !alive;
	}
	
	//Methods
	public int toBearFruit () {
		if(alive) {
			Random random = new Random();
			int x = random.nextInt(5) + 1;
			int fruitGeneration = (this.timeOfLife / 4) * x;
			if(this.fertilized)
				fruitGeneration *= 2;
			if(this.watered)
				fruitGeneration += 2;
			return fruitGeneration;
		}
		return 0;
	}
	
	//toString
	public String toString() {
		return "Plant [productName = " + productName + ", stageOfLife = " + stageOfLife + ", watered = " + watered + ", ripe = "
				+ ripe + ", fertilized = " + fertilized + ", timeOfLife = " + "(" + timeOfLife +  "/10)" + "]";
	}
	
	
	
	
	
}
