package com.utad.Fiis.DS.Molecor;

public interface MolecorRequestStateAbstractFactory {
	public CreateRequestState createCreateRequestState();
	public AdmitRequestState createAdmitRequestState();
	public DeclineRequestState createDeclineRequestState();
	public ProcessRequestState createProcessRequestState();
 	public FinishRequestState createFinishRequestState();
}
