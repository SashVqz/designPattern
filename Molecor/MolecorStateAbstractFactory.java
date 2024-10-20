package com.utad.Fiis.DS.Molecor;

// Abstract factory for the request states

public class MolecorStateAbstractFactory implements MolecorRequestStateAbstractFactory {
	private MolecorRequestContext molecorRequestContext;
	
	public MolecorStateAbstractFactory(MolecorRequestContext molecorRequestContext) {
		super();
		this.molecorRequestContext = molecorRequestContext;
	}

	public CreateRequestState createCreateRequestState() {
		return new CreateRequestState(this.molecorRequestContext);
	}

	public AdmitRequestState createAdmitRequestState() {
		return new AdmitRequestState(this.molecorRequestContext);
	}

	public DeclineRequestState createDeclineRequestState() {
		return new DeclineRequestState(this.molecorRequestContext);
	}

	public ProcessRequestState createProcessRequestState() {
		return new ProcessRequestState(this.molecorRequestContext);
	}

	public FinishRequestState createFinishRequestState() {
		return new FinishRequestState(this.molecorRequestContext);
	}
}
