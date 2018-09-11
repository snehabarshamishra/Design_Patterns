package visitor;

import routers.DLinkRouter;
import routers.LinkSysRouter;
import routers.TPLinkRouter;

public interface RouterVisitor {
	public void visit(DLinkRouter router);
	public void visit(TPLinkRouter router);
	public void visit(LinkSysRouter router);
}
