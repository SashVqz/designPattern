public class FinishingRequestNotificationStratergy extends MolecorPullPushNotificationStratergy{
	public FinishingRequestNotificationStratergy(MolecorRequestContext molecorRequestContext) {
		super(molecorRequestContext);
	}

	@Override
	public void update(MolecorCustomer molecorCustomer, MolecorRequestNotification molecorRequestNotification) {
		molecorCustomer.update(molecorRequestNotification,this);
	}

	@Override
	public String notification() {
		return super.getMolecorRequestContext().getMolecorCustomer().getName() + " your request is: " + super.getMolecorRequestContext().getMolecorPipe().toString();
	}
}
