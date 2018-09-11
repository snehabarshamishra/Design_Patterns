package after;

import after.RequestForLoan.ApplicantType;

public class BuilderClient {

	
	public static void main(String[] args) {
		RequestForLoan loanApplication = 
				RequestForLoan.startBuilding()
				.applicantName("pradeep")
				.requiredTerm(5)
				.type(ApplicantType.INDIVIDUAL)
				.cibilScore(500)
				.build();

	}

}
