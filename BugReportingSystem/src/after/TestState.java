package after;

public class TestState {

	
	public static void main(String[] args) {
		BugReport report = new BugReport();
		
		report.reportBug("mouse not working");
		report.acceptBugReport();
		report.assignBugToDeveloper("self");
		report.resolveBug("connect it");
		report.acceptBugReport();

	}

}
