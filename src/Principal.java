
public class Principal {
	public static void main (String agr[]) {
		
		AgriculturalFloor teste = new AgriculturalFloor (1,15,10.2,35.75);

		teste.toPlant("Tomate", 5);
		teste.toWater();
		teste.toPlant("Cebola", 5);
		for ( int i = 0; i < 5; i++)
			System.out.println(teste.plantation[i]);
		
		
	}
}
