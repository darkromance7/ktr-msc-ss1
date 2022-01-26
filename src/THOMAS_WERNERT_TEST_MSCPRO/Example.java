package THOMAS_WERNERT_TEST_MSCPRO;

public class Example {
	
	
	public static void main(String[] args) {
		
		
		Character warrior = new Warrior ("Jean-Luc") ;
		Character mage = new Mage ("Robert") ;
		warrior . moveRight () ;
		warrior . moveLeft () ;
		warrior . moveBack () ;
		warrior . moveForward () ;
		mage . moveRight () ;
		mage . moveLeft () ;
		mage . moveBack () ;
		mage . moveForward () ;
		mage.unsheathe();
		warrior.unsheathe();
		
	}
	
	

}
