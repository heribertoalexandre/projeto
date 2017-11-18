import java.util.ArrayList;

public class PlantRepository {
	
	private ArrayList <Plant> speciesCatalog = new ArrayList <Plant> ();
	
	
	public void toCreate (Plant plant) {
		speciesCatalog.add(plant);
	}
	
	public boolean toRemove (String specie) {
		for(int count = 0; count < speciesCatalog.size(); count++) {
			
			Plant p = speciesCatalog.get(count);
			 
			if(speciesCatalog.get(count).getProductName().equals(specie)) {
				speciesCatalog.remove(p);		
				return true;
			}
		}
		return false;
	}
	
	public void toList() {
		for(int count = 0; count < speciesCatalog.size(); count++) {
			System.out.println(speciesCatalog.get(count));
		}
	}
	
}
