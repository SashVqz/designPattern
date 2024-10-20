package com.utad.Fiis.DS.Molecor;

public class ProcessingRequestNotificationStratergy extends MolecorPullPushNotificationStratergy{
	public ProcessingRequestNotificationStratergy(MolecorRequestContext molecorRequestContext) {
		super(molecorRequestContext);
	}

	@Override
	public void update(MolecorCustomer molecorCustomer, MolecorRequestNotification molecorRequestNotification) {
		molecorCustomer.update(molecorRequestNotification, this);
	}

	@Override
	public String notification() {
		return super.getMolecorRequestContext().getMolecorCustomer().getName() + " the request was processed.";
	}
}
