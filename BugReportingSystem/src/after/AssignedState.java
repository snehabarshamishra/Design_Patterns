package after;

public class AssignedState extends BugReportState {
	
	@Override
	public void resolveBug(BugReport ctx,String bugSolution){
		ctx.setBugSolution(bugSolution);
		ctx.setCurrentState(BugReport.RESOLVED);
	}

}
