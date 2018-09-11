package after;

public class Client {

	public static void main(String[] args) {
		Socket s = new Socket();
		Socket s2 = new SecureSocket();

	}

}

class SecureSocket extends Socket{
	
	@Override
	public void send(byte[] data) {
		// Encryption Logic here 
		super.send(data);
	}
	
	@Override
	public void receive(byte[] data) {
		// Decryption Logic here 
		super.receive(data);
	}
	
}