package routers;

import visitor.RouterVisitor;

public class LinkSysRouter implements Router{

	@Override
	public void sendData(char[] data) {
	}

	@Override
	public void acceptData(char[] data) {
	}
	
	@Override
	public void accept(RouterVisitor v) {
		v.visit(this);
	}

}

