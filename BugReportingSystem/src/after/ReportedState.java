package after;
import static after.BugReport.*;
public class ReportedState extends BugReportState {
	
	@Override
	public void reportBug(BugReport ctx,String bugDescription){
		ctx.setBugDescription(bugDescription);
	}
	
	@Override
	public void acceptBugReport(BugReport ctx){
		ctx.setCurrentState(ACCEPTED);
	}

}
