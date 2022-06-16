
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal baxter = new Dog("Baxter", "Brown", "Bark");
		((Dog)baxter).sleep();
		((Dog)baxter).getInfo();
		Animal rex = new Dog("Rex", "Black", "Growl");
		((Dog)rex).sleep();
		((Dog)rex).getInfo();
		
		Animal perry = new Platypus("Perry", "Green", "Grrrrr");
		((Platypus)perry).sleep();
		((Platypus)perry).venomDetails();
		((Platypus)perry).getInfo();
		
		System.out.println(((Platypus)perry).hasTeeth);
	}

}
