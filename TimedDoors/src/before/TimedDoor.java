package before;

import timerapi.Timer;



public class TimedDoor extends Door {
	
	
	
	public TimedDoor(){
		Timer t = new Timer();
		
	//	t.schedule(this, "now", 100L);
	}
	
	public void makeSound(){
		while(isOpen())
			java.awt.Toolkit.getDefaultToolkit().beep();
	}
	

}
