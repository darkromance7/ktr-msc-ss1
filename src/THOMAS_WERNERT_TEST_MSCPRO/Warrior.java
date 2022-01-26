package THOMAS_WERNERT_TEST_MSCPRO;

public class Warrior extends Character{

	public Warrior(String name) {
		super(name, "Warrior");

		//possible car avec protected on peut accéder au attribut depuis le meme package
		super.life = 100;
		super.strength = 10;
		super.agility = 8;
		super.wit = 3;
		
		System.out.println(name  + ": My name will go down in history ! ");
	}

	//Attack 

	@Override public void attack(String weapon) {

		if(weapon == "hammer" || weapon == "sword") {
			super.attack(weapon);
			System.out.println(name  + ": I'll crush you with my " + weapon + "!");
		}

	}
	
	
	
	@Override public void moveRight() {
		super.moveRight();
		System.out.print("like a bad boy. \n");
	}
	@Override public void moveLeft(){
		super.moveLeft();
		System.out.print("like a bad boy. \n");
	}
	@Override public void moveForward(){
		super.moveForward();
		System.out.print("like a bad boy. \n");
	}
	@Override public void moveBack(){
		super.moveBack();
		System.out.print("like a bad boy. \n");
	}

}
