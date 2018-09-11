package acyclic;

import visitor.RouterVisitor;

public class LinkSysRouter implements Router{

	@Override
	public void sendData(char[] data) {
	}

	@Override
	public void acceptData(char[] data) {
	}
	
	@Override
	public void accept(RouterAcyclicVisitor v) {
		SysLinkVisitor sysLinkVisitor =(SysLinkVisitor)v;
		
		sysLinkVisitor.visit(this);
	}

}

