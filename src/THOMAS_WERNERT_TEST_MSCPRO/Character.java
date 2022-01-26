package THOMAS_WERNERT_TEST_MSCPRO;

public abstract class Character implements Movable {
	
	protected  String name;
	protected final String RPGClass;
	protected float life = 50;
	protected float agility = 2;
	protected float strength = 2;
	protected float wit = 2;
	
	//CONSTRUCTOR
	
	public Character(String name, String rPGClass) {
		this.name = name;
		this.RPGClass  = rPGClass;
	}
	
	
	//METHODS
	
	public void attack(String str) {
		
		System.out.println(this.name  + ": Rrrrrrrrr ....");
		
	}
		
	public final void unsheathe() {
		System.out.println(this.name  + ": unsheathes his weapon .");
	}
				

	
	@Override public void moveRight() {
		System.out.print(this.name + ": moves right ");
	}
	@Override public void moveLeft() {
		System.out.print(this.name + ": moves left ");
	}
	@Override public void moveForward() {
		System.out.print(this.name + ": moves forward ");
	}
	@Override public void moveBack() {
		System.out.print(this.name + ": moves back ");
	}

	
	//GETTERS

	public String getName() {
		return name;
	}

	public String getRPGClass() {
		return RPGClass;
	}

	public float getLife() {
		return life;
	}

	public float getAgility() {
		return agility;
	}

	public float getStrength() {
		return strength;
	}

	public float getWit() {
		return wit;
	}
	
	
	
}
