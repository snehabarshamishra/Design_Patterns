package after;

public class Door {
	boolean open;

	public boolean isOpen() {
		return open;
	}

	public void open(){
		this.open = true;
	}
	public void close(){
		this.open = false;
	}

}
