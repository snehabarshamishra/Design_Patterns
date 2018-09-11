package acyclic;

public interface SysLinkVisitor extends RouterAcyclicVisitor {

	public void visit(LinkSysRouter r);
}
