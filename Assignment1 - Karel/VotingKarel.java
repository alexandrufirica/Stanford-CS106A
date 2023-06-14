import stanford.karel.SuperKarel;

public class VotingKarel extends SuperKarel {
	
	public void run() {
		while (frontIsClear()){
			move();
			if (beepersPresent() ) {
				checkPile();
			}else{
				cleanPile();
			
		}
		}
	}
	
	public void checkPile() {
		checkUp();
		checkDown();
		
	}
	
	public void checkUp() {
		turnLeft();
		move();
		if (beepersPresent() ) {
			turnAround();
		}else{
			putBeeper();
		}
		move();
	}
	
	public void checkDown() {
		move();
		if (beepersPresent() ) {
			turnAround();
		}else{
			putBeeper();
			}
		move();
		turnRight();
	}
	
	public void cleanPile() {
		cleanUp();
		cleanDown();
	}
	
	public void cleanUp() {
		turnLeft();
		move();
		while (beepersPresent() ) {
			pickBeeper();
		}
		turnAround();
		move();
	}
	public void cleanDown() {
		move();
		while (beepersPresent() ) {
			pickBeeper();
		}
		turnAround();
		move();
		turnRight();
	}
	
}
