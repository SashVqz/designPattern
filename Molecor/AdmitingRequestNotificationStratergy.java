public class AdmitingRequestNotificationStratergy extends MolecorPullPushNotificationStratergy{

	public AdmitingRequestNotificationStratergy(MolecorRequestContext molecorRequestContext) {
		super(molecorRequestContext);
	}

	@Override
	public void update(MolecorCustomer molecorCustomer, MolecorRequestNotification molecorRequestNotification){
		
		molecorCustomer.update(molecorRequestNotification, this);
	}

	@Override
	public String notification() {
		return super.getMolecorRequestContext().getMolecorCustomer().getName() + " the request was admitted.";
	}
}
