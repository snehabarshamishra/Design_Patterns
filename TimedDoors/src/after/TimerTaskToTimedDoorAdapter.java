package after;

import timerapi.TimerTask;



public class TimerTaskToTimedDoorAdapter extends TimerTask{
	
	TimedDoor timedDoor;

	public TimerTaskToTimedDoorAdapter(TimedDoor timedDoor) {
		super();
		this.timedDoor = timedDoor;
	}

	@Override
	public void run() {
		timedDoor.makeSound();
		
	}
	
	

}
