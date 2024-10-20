public class DeclineRequestState implements MolecorRequestStateTransition {
	public DeclineRequestState(MolecorRequestContext molecorRequestContext) {
		super();
	}
	
	@Override
	public void process() {
		this.declinedRequest();
	}

	@Override
	public void admitedRequest() {
		throw new IllegalStateException("admitedRequest not available");
	}

	@Override
	public void declinedRequest() {
		System.out.println("Request declined");
		System.exit(0);
	}

	@Override
	public void processedRequest() {
		throw new IllegalStateException("processedRequest not available");
	}

	@Override
	public void finishedRequest() {
		throw new IllegalStateException("finishedRequest not available");
	}
}
