package after;

public class RequestForLoan {
	
	public static enum ApplicantType{
		CORPORATE,GOVERNMENT,INDIVIDUAL;
	}
	private String applicantName;//always needed
	private String address;//optional
	private String purposeOfLoan;//optional
	private String specialRequests;//optional
	private ApplicantType type;// always needed
	private int cibilScore;// needed for all types other than gov
	private int requiredTerm;//optional
	
	
	public static RequestForLoanBuilder startBuilding(){
		return new RequestForLoanBuilder();
	}
	
	public static class RequestForLoanBuilder{
		
		private String applicantName;//always needed
		private String address;//optional
		private String purposeOfLoan;//optional
		private String specialRequests;//optional
		private ApplicantType type;// always needed
		private int cibilScore;// needed for all types other than gov
		private int requiredTerm;//optional
		
		public RequestForLoanBuilder applicantName(String applicantName){
			this.applicantName = applicantName;
			return this;
		}
		public RequestForLoanBuilder address(String address){
			this.address = address;
			return this;
		}
		public RequestForLoanBuilder purposeOfLoan(String purposeOfLoan){
			this.purposeOfLoan = purposeOfLoan;
			return this;
		}
		public RequestForLoanBuilder specialRequests(String specialRequests){
			this.specialRequests = specialRequests;
			return this;
		}
		
		public RequestForLoanBuilder type(ApplicantType type){
			this.type = type;
			return this;
		}
		
		public RequestForLoanBuilder cibilScore(int cibilScore){
			this.cibilScore = cibilScore;
			return this;
		}
		public RequestForLoanBuilder requiredTerm(int requiredTerm){
			this.requiredTerm = requiredTerm;
			return this;
		}
		
		public RequestForLoan build(){
			if(this.applicantName == null || this.type == null){
				throw new IllegalArgumentException("Applicant name and type are mandatory");
			}
			if(this.type != ApplicantType.GOVERNMENT && this.cibilScore <= 0){
				throw new IllegalArgumentException("positive cibil score needed for non guv applicants");
			}
			
			return new RequestForLoan(this);
		}
	}
	private RequestForLoan(RequestForLoanBuilder builder) {
		super();
		this.applicantName = builder.applicantName;
		this.address = builder.address;
		this.purposeOfLoan = builder.purposeOfLoan;
		this.specialRequests = builder.specialRequests;
		this.type = builder.type;
		this.cibilScore = builder.cibilScore;
		this.requiredTerm = builder.requiredTerm;
	}
	
	
	

}
