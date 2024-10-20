package com.utad.Fiis.DS.Molecor;

import java.util.Objects;

/*
 * Observer
 */

public class MolecorCustomer implements ModelPullPushObserver {
	private String name;
	private Boolean activeAccount;
	
	public MolecorCustomer(String name, Boolean activeAccount) {
		super();
		this.name = name;
		this.activeAccount = activeAccount;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getActiveAccount() {
		return activeAccount;
	}

	public void setActiveAccount(Boolean activeAccount) {
		this.activeAccount = activeAccount;
	}
	
	public void update(MolecorRequestNotification molecorRequestNotification, Object object) {
		if (this.getActiveAccount()) {
			if (!Objects.isNull(object) && object instanceof MolecorPullPushNotificationStrategy) {
				MolecorPullPushNotificationStrategy molecorPullPushNotificationStrategy = (MolecorPullPushNotificationStrategy) object;
				System.out.println("Notification to user: " + molecorPullPushNotificationStrategy.notification());
			} else {
				if (molecorRequestNotification instanceof MolecorRequestNotification) {
					System.out.println("Notification to user: " + this.getName() + molecorRequestNotification.getMolecorPullPushNotificationStrategy().notification());
				}
			}
		} else {
			System.out.println("Error");
		}
	}
}