package com.utad.Fiis.DS.Molecor;

public abstract class MolecorPullPushNotificationStratergy {
	private MolecorRequestContext molecorRequestContext;
	
	public MolecorPullPushNotificationStratergy(MolecorRequestContext molecorRequestContext) {
		this.molecorRequestContext = molecorRequestContext;
	}

	public MolecorRequestContext getMolecorRequestContext() {
		return molecorRequestContext;
	}
	
	public void setMolecorRequestContext(MolecorRequestContext molecorRequestContext) {
		this.molecorRequestContext = molecorRequestContext;
	}

	public abstract void update(MolecorCustomer molecorCustomer, MolecorRequestNotification molecorRequestNotification);
	public abstract String notification();
}
