package car; // toujour en miniscule

public class Car {

	private String brand;
	private Integer velocity;

	///// generer les setter

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Integer getVelocity() {
		return velocity;

	}

	public void setVelocity(Integer velocity) {
		this.velocity = velocity;
	}

	
	/* le fait de creer un objet comme ca dans le main :  Car C1 = new Car(); on automatiquement un constructur vide :
	 mais si on creer un autre constructeur rempli dans le main il nous supprime ce dernier du coup de fois il faut le creer
	 */
	public Car() {
		
	}

	/* ce constructeur n'a pas besoin d'avoir des set, un constructeur avec des 
	attributs permets d'éviter d'ecrire la methode set dans main */
	
	public Car(String brand, Integer velocity) {
		super();
		this.brand = brand;
		this.velocity = velocity;
	}

}
