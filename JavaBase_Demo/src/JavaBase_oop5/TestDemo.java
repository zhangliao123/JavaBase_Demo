package JavaBase_oop5;

public class TestDemo {

	public static void main(String[] args) {

		AntImpl ant =new AntImpl(); 
		ant.Fly();
		System.out.println("Ant has " + ant.legs + " legs!");
		
		DoveImpl dove =new DoveImpl();
		dove.Fly();
		System.out.println("Dove has " + dove.legs + " legs!");
	}

}
