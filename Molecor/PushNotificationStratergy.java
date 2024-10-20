package com.utad.Fiis.DS.Molecor;

public class PushNotificationStratergy implements NotificationStratergy{
	@Override
	public void update(MolecorCustomer molecorCustomer, MolecorRequestNotification molecorRequestNotification, Object object) {
		molecorCustomer.update(null, object);
	}
}
