package after;

public abstract class BugReportState {
	
	
	public void reportBug(BugReport ctx,String bugDescription){
		throw new IllegalStateException("this operation not valid");
	}
	public void acceptBugReport(BugReport ctx){
		throw new IllegalStateException("this operation not valid");
	}
	public void assignBugToDeveloper(BugReport ctx,String assignedDeveloperName){
		throw new IllegalStateException("this operation not valid");
	}
	public void resolveBug(BugReport ctx,String bugSolution){
		throw new IllegalStateException("this operation not valid");
	}

}
