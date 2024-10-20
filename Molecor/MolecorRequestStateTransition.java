package com.utad.Fiis.DS.Molecor;

public interface MolecorRequestStateTransition extends MolecorRequestState {
	public void admitedRequest();
	public void declinedRequest();
	public void processedRequest();
	public void finishedRequest();
}
