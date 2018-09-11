package before;

public abstract class Socket {
	
	public abstract void listen(int port);
	public abstract void connect();
	public abstract void send(byte[] data);
	public abstract void receive(byte[] data);

}
