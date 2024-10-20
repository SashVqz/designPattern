package com.utad.Fiis.DS.Molecor;

public class PullPushNotificationStratergy implements NotificationStratergy{
	@Override
	public void update(MolecorCustomer molecorCustomer, MolecorRequestNotification molecorRequestNotification, Object object) {
		molecorCustomer.update(molecorRequestNotification, object);
	}
}
