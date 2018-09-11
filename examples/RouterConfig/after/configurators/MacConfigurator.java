package configurators;

import routers.DLinkRouter;
import routers.LinkSysRouter;
import routers.TPLinkRouter;
import visitor.RouterVisitor;

public class MacConfigurator implements RouterVisitor{

	@Override
	public void visit(DLinkRouter router) {
		System.out.println("DLinkRouter Configuration for Mac complete !!");
	}

	@Override
	public void visit(TPLinkRouter router) {
		System.out.println("TPLinkRouter Configuration for Mac complete !!");
	}

	@Override
	public void visit(LinkSysRouter router) {
		System.out.println("LinkSysRouter Configuration for Mac complete !!");
	}
}
