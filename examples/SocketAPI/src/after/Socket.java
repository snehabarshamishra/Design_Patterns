package after;

public class Socket {
	
	private SocketImpl impl = getImpl();

	private SocketImpl getImpl() {
		//Logic to check the current OS and dynamically instantiate an appropriate impl
		return null;
	}

	public void listen(int port) {
		impl.listen(port);
	}

	public void connect() {
		impl.connect();
	}

	public void send(byte[] data) {
		impl.send(data);
	}

	public void receive(byte[] data) {
		impl.receive(data);
	}

	public boolean equals(Object obj) {
		return impl.equals(obj);
	}
	

}
