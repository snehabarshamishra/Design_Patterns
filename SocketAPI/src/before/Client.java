package before;

public class Client {

	public static void main(String[] args) {
		Socket s = new WindowsSocket();
		Socket s2 = new SecureWindowsSocket();

	}

}

class SecureWindowsSocket extends WindowsSocket{
	
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