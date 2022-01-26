package THOMAS_WERNERT_TEST_MSCPRO.exceptions;

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

	@Override public void attack(String weapon) throws WeaponExecption {

		if(weapon == "hammer" || weapon == "sword") {
			super.attack(weapon);
			System.out.println(name  + ": I'll crush you with my " + weapon + "!");
		} else if (weapon == "") {
			throw new WeaponExecption(name  + ": I refuse to fight with my bare hands .");

		}else {
			throw new WeaponExecption(name  + ": A " + weapon +"?? What should I do with this ?!");
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
