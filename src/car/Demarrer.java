package car;

public class Demarrer {

	public static void main(String[] args) {

		Car C1 = new Car();
		C1.setBrand("Porshe");
		C1.setVelocity(300);

		System.out.println(" la marque de la voiture : " + C1.getBrand() + "      ////////     "
				+ "  la vitesse de la voiture est de :  " + C1.getVelocity());

		Car C2 = new Car("AUDI", 400);
		System.out.println("Marque de véhicule : " + "      ////////     " + "Vitesse de véhicule : " + C2.getBrand()
				+ " " + C2.getVelocity() + " Km/h");

	}

}
