package THOMAS_WERNERT_TEST_MSCPRO.exceptions;

public class Mage extends Character{

	public Mage(String name) {
		super(name, "Mage");

		//possible car avec protected on peut accéder au attribut depuis le meme package
		super.life = 70;
		super.strength = 3;
		super.agility = 10;
		super.wit = 10;

		System.out.println(name  + ": May the gods be with me .");
	}

	//Attack 

	@Override public void attack(String weapon) throws WeaponExecption {

		if(weapon == "magic" || weapon == "wand") {
			super.attack(weapon);
			System.out.println(name  + ": Feel the ower of my " + weapon + "!");
		} else if (weapon == "") {
			throw new WeaponExecption(this.name  + ": I refuse to fight with my bare hands .");

		}else {
			throw new WeaponExecption(name  + ": I don't need this stupid " + weapon +"! Don't misjudge my powers!");
		}

	}

	public void tryToAttack (String weapon) {
		try {
			this.attack(weapon);

		} catch(WeaponExecption e ) {
			System.out.println(e.getMessage());
		}
	}

	@Override public void moveRight() {
		super.moveRight();
		System.out.print("furtively; \n");
	}
	@Override public void moveLeft(){
		super.moveLeft();
		System.out.print("furtively. \n");
	}
	@Override public void moveForward(){
		super.moveForward();
		System.out.print("furtively. \n");
	}
	@Override public void moveBack(){
		super.moveBack();
		System.out.print("furtively. \n");
	}

}
