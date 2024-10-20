package com.utad.Fiis.DS.Molecor;

/*
 * Strategy Context
 * Observable
 */
 
public class MolecorRequestNotification implements ModelPullPushObservable {
	private NotificationStrategy notificationStrategy; // notification type of the observer --> default is push
	private MolecorRequestContext molecorRequestContext; // state variable of the observer pattern
	
	// notification strategies could be done by an abstract factory --> ask if template can be applied
	private MolecorPullPushNotificationStrategy molecorPullPushNotificationStrategy;
	private MolecorPullPushNotificationStrategy admittingRequestNotificationStrategy;
	private MolecorPullPushNotificationStrategy processingRequestNotificationStrategy;
	private MolecorPullPushNotificationStrategy finishingRequestNotificationStrategy;

	public MolecorRequestNotification(MolecorRequestContext molecorRequestContext) {
		this.notificationStrategy = new PushNotificationStrategy();
		this.molecorRequestContext = molecorRequestContext;
		
		this.admittingRequestNotificationStrategy = new AdmittingRequestNotificationStrategy(this.molecorRequestContext);
		this.processingRequestNotificationStrategy = new ProcessingRequestNotificationStrategy(this.molecorRequestContext);
		this.finishingRequestNotificationStrategy = new FinishingRequestNotificationStrategy(this.molecorRequestContext);
		
		this.setMolecorPullPushNotificationStrategy(this.getAdmittingRequestNotificationStrategy());	
	}
	
	public MolecorPullPushNotificationStrategy getMolecorPullPushNotificationStrategy() {
		return molecorPullPushNotificationStrategy;
	}

	public void setMolecorPullPushNotificationStrategy(
			MolecorPullPushNotificationStrategy molecorPullPushNotificationStrategy) {
		this.molecorPullPushNotificationStrategy = molecorPullPushNotificationStrategy;
	}

	public MolecorRequestContext getMolecorRequestContext() {
		return molecorRequestContext;
	}

	public void setMolecorRequestContext(MolecorRequestContext molecorRequestContext) {
		this.molecorRequestContext = molecorRequestContext;
	}
	
	public NotificationStrategy getNotificationStrategy() {
		return notificationStrategy;
	}

	public void setNotificationStrategy(NotificationStrategy notificationStrategy) {
		this.notificationStrategy = notificationStrategy;
	}
	
	public MolecorPullPushNotificationStrategy getAdmittingRequestNotificationStrategy() {
		return admittingRequestNotificationStrategy;
	}

	public MolecorPullPushNotificationStrategy getProcessingRequestNotificationStrategy() {
		return processingRequestNotificationStrategy;
	}

	public MolecorPullPushNotificationStrategy getFinishingRequestNotificationStrategy() {
		return finishingRequestNotificationStrategy;
	}

	public void notifyRequestObserver(MolecorCustomer molecorCustomer, MolecorPullPushNotificationStrategy molecorPullPushNotificationStrategy) {
		// delegation by injection
		this.notificationStrategy.update(molecorCustomer, this, molecorPullPushNotificationStrategy);
	}
}
