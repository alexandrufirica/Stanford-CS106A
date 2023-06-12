import stanford.karel.*;

public class karelborder extends SuperKarel {
	
	public void run() {
		
		karelStart();
		work();
	}

	private void karelStart(){
		turnLeft();
		move();
		turnRight();
	}
	
	private void work(){
	
		while (frontIsClear()){
			move();
			
			if (frontIsBlocked()){
				turnLeft();
				turnLeft();
				pickBeeper();
				move();
				turnRight();
			}
		}
				
	}
}
