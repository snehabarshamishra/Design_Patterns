package acyclic;

import visitor.RouterVisitor;

public interface Router 
{
	public void sendData(char[] data);
	public void acceptData(char[] data);
	
	public void accept(RouterAcyclicVisitor v);
}
