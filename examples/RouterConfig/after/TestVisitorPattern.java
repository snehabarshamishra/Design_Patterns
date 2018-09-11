

import junit.framework.TestCase;

import configurators.LinuxConfigurator;
import configurators.MacConfigurator;
import routers.DLinkRouter;
import routers.LinkSysRouter;
import routers.Router;
import routers.TPLinkRouter;

public class TestVisitorPattern extends TestCase
{
	private MacConfigurator macConfigurator;
	private LinuxConfigurator linuxConfigurator;
	private Router dlink;
	private Router tplink;
	private Router linksys;
	
	public void setUp()
	{
		macConfigurator = new MacConfigurator();
		linuxConfigurator = new LinuxConfigurator();
		
		dlink = new DLinkRouter();
		tplink = new TPLinkRouter();
		linksys = new LinkSysRouter();
	}
	
	public void testDlink()
	{
		dlink.accept(macConfigurator);
		dlink.accept(linuxConfigurator);
	}
	
	public void testTPLink()
	{
		tplink.accept(macConfigurator);
		tplink.accept(linuxConfigurator);
	}
	
	public void testLinkSys()
	{
		linksys.accept(macConfigurator);
		linksys.accept(linuxConfigurator);
	}
	
	/*public void test1(Router r){
		macConfigurator.visit(r);
	}*/
	
}
