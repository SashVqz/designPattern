package com.utad.Fiis.DS.Molecor;

public class ProcessRequestState implements MolecorRequestStateTransition{
	private MolecorRequestContext molecorRequestContext;
	private MolecorPullPushNotificationStratergy molecorPullPushNotificationStratergy;
	
	public ProcessRequestState(MolecorRequestContext molecorRequestContext) {
		super();
		this.molecorRequestContext = molecorRequestContext;
		this.molecorPullPushNotificationStratergy = new FinishingRequestNotificationStratergy(molecorRequestContext);
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
		this.molecorRequestContext.setCurrentState(this.molecorRequestContext.getFinishRequestState());
		this.molecorRequestContext.notificationProcess(this.molecorPullPushNotificationStratergy);
	}

	@Override
	public void finishedRequest() {
		throw new IllegalStateException("finishedRequest not available");
	}
}
