
public abstract class Mammal extends Animal {
	private String furColour;
	
	
	public Mammal(String name, String furColour) {
		// TODO Auto-generated constructor stub
		super(name);
		this.furColour = furColour;
	}

	public void controlTemperature() {
		
	}	
	
	public String getFurColour() {
		return furColour;
	}
	
}
