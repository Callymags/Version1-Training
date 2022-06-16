
public class Dog extends Mammal {
	private String sound;
	
	
	public Dog(String name, String furColour, String sound) {
		// TODO Auto-generated constructor stub
		super(name, furColour);	
		this.sound = sound;
	}

	public void controlTemperature() {
		System.out.println("Temperature controlled");
	}
	
//	This overwrites the method in the Animal class
	@Override
	public void sleep() {
		System.out.println("Dog Sleeping");
	}
	
	public void bark(String sound) {
		this.setSound(sound);
	}


	public String getSound() {
		return sound;
	}



	public void setSound(String sound) {
		this.sound = sound;
	}
	
	public void getInfo() {
		System.out.println("Name: " + this.getName() + ", Fur: " + this.getFurColour() + ", Sound: " + this.getSound());
	}
	
	
}
