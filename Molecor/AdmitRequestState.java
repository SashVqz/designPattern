public class AdmitRequestState implements MolecorRequestStateTransition{
	private MolecorRequestContext molecorRequestContext;
	private MolecorPullPushNotificationStratergy molecorPullPushNotificationStratergy;

	public AdmitRequestState(MolecorRequestContext molecorRequestContext) {
		super();
		this.molecorRequestContext = molecorRequestContext;
		this.molecorPullPushNotificationStratergy = new ProcessingRequestNotificationStratergy(molecorRequestContext);
	}

	@Override
	public void process() {
		this.processedRequest();
	}

	@Override
	public void admitedRequest() {
		throw new IllegalStateException("admitLibraryLoan not available");	
	}

	@Override
	public void declinedRequest() {
		throw new IllegalStateException("declinedRequest not available");	
	}

	@Override
	public void processedRequest() {
		this.molecorRequestContext.notificationProcess(this.molecorPullPushNotificationStratergy);
		this.molecorRequestContext.setCurrentState(this.molecorRequestContext.getProcessRequestState());
	}

	@Override
	public void finishedRequest() {
		throw new IllegalStateException("admitLibraryLoan not available");	
	}

}
