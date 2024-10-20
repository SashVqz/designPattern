package com.utad.Fiis.DS.Molecor;

public class PullNotificationStratergy implements NotificationStratergy{
	@Override
	public void update(MolecorCustomer molecorCustomer, MolecorRequestNotification molecorRequestNotification, Object object) {
		molecorCustomer.update(molecorRequestNotification, null);
	}
}
