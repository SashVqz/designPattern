package com.utad.Fiis.DS.Molecor;

/*
 * 
 * Context of the state pattern
 * state variable of the observer pattern
 * 
 * Contains the observable model
 * Contains the factory of the request states
 * 
 */

public class MolecorRequestContext {
	// Observable model --- Client notification system 
	private MolecorRequestNotification molecorRequestNotification;
	
	// Client --> observer
	private MolecorCustomer molecorCustomer;
	
	// Pipes --> Decorated Object
	private MolecorPipe molecorPipe;
	
	// Molecor --> Singleton and Facade
	private Molecor molecor;
	
	// state factory 
	private MolecorStateAbstractFactory molecorStateAbstractFactory;
	
	// request states
	private MolecorRequestState currentState;
	private CreateRequestState createRequestState;
	private AdmitRequestState admitRequestState;
	private DeclineRequestState declineRequestState;
	private ProcessRequestState processRequestState;
	private FinishRequestState finishRequestState;
	
	public MolecorRequestContext(MolecorCustomer molecorCustomer, MolecorPipe molecorPipe, Molecor molecor) {
		super();
		
		this.molecorCustomer = molecorCustomer;
		this.molecorPipe = molecorPipe;
		this.molecor = molecor;
		
		this.molecorRequestNotification = new MolecorRequestNotification(this);
		
		this.molecorStateAbstractFactory = new MolecorStateAbstractFactory(this);
		
		this.createRequestState = this.molecorStateAbstractFactory.createCreateRequestState();
		this.admitRequestState = this.molecorStateAbstractFactory.createAdmitRequestState();
		this.declineRequestState = this.molecorStateAbstractFactory.createDeclineRequestState();
		this.processRequestState = this.molecorStateAbstractFactory.createProcessRequestState();
		this.finishRequestState = this.molecorStateAbstractFactory.createFinishRequestState();
		 
		this.setCurrentState(this.createRequestState);
	}
	
	public MolecorRequestState getCurrentState() {
		return currentState;
	}
		
	public void setCurrentState(MolecorRequestState currentState) {
		this.currentState = currentState;
	}
	
	public AdmitRequestState getAdmitRequestState() {
		return admitRequestState;
	}
	
	public DeclineRequestState getDeclineRequestState() {
		return declineRequestState;
	}
	
	public ProcessRequestState getProcessRequestState() {
		return processRequestState;
	}
	
	public FinishRequestState getFinishRequestState() {
		return finishRequestState;
	}

	public MolecorRequestNotification getMolecorRequestNotification() {
		return molecorRequestNotification;
	}

	public void setMolecorRequestNotification(MolecorRequestNotification molecorRequestNotification) {
		this.molecorRequestNotification = molecorRequestNotification;
	}
	
	public Molecor getMolecor() {
		return molecor;
	}

	public void setMolecor(Molecor molecor) {
		this.molecor = molecor;
	}

	public MolecorCustomer getMolecorCustomer() {
		return molecorCustomer;
	}

	public void setMolecorCustomer(MolecorCustomer molecorCustomer) {
		this.molecorCustomer = molecorCustomer;
	}

	public MolecorPipe getMolecorPipe() {
		return molecorPipe;
	}

	public void setMolecorPipe(MolecorPipe molecorPipe) {
		this.molecorPipe = molecorPipe;
	}
	
	public void process() {
		this.currentState.process();
	}
	
	// unnecessary but it is to facilitate reading in the states
	public void notificationProcess(MolecorPullPushNotificationStratergy molecorPullPushNotificationStratergy) {
		this.getMolecorRequestNotification().notifyRequestObserver(molecorCustomer, molecorPullPushNotificationStratergy);
	}
}
