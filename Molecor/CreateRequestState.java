public class CreateRequestState implements MolecorRequestStateTransition {
	private MolecorRequestContext molecorRequestContext;
	private MolecorPullPushNotificationStratergy molecorPullPushNotificationStratergy;
	
	public CreateRequestState(MolecorRequestContext molecorRequestContext) {
		super();
		this.molecorRequestContext = molecorRequestContext;
		this.molecorPullPushNotificationStratergy = new AdmitingRequestNotificationStratergy(molecorRequestContext);
	}

	public void process() {
		if(this.molecorRequestContext.getMolecorCustomer().getActiveAcount()) {
			this.admitedRequest();
		}else {
			this.declinedRequest();
		}
	}

	public void admitedRequest() {
		this.molecorRequestContext.notificationProcess(this.molecorPullPushNotificationStratergy);
		this.molecorRequestContext.setCurrentState(this.molecorRequestContext.getAdmitRequestState());
	}

	public void declinedRequest() {
		this.molecorRequestContext.setCurrentState(this.molecorRequestContext.getDeclineRequestState());		
	}

	public void processedRequest() {
		throw new IllegalStateException("processedRequest not available");		
	}

	public void finishedRequest() {
		throw new IllegalStateException("finishedRequest not available");		
	}
}
