public class Base {

	
	Location location;
	int population;
	int tier;
	double growthRate;//needs a function
	double radius;//needs a function
	int ownerID;
	int baseID;
	int popLimit;
	
	public Base(Location location, int population, int ownerID, int baseID){
		this.location=location;
		this.population=population;
		this.ownerID=ownerID;
		this.tier = 0;
		this.baseID = gameState.newBaseID();//I dunnnooooo.
		
	}

	public void createPlatoon() {

	}

	public void upgrade() {
		if (tier < 3) {
			tier++;
		} else {
			// return error
		}

	}
	
	public void createResources(){
		
	}
	
	public void createPopulation(){
		
	}

}
