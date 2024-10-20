public class FinishRequestState implements MolecorRequestStateTransition{
	public FinishRequestState(MolecorRequestContext molecorRequestContext) {
		super();
	}

	@Override
	public void process() {
		this.finishedRequest();
	}

	@Override
	public void admitedRequest() {
		throw new IllegalStateException("admitedRequest not available");
	}

	@Override
	public void declinedRequest() {
		throw new IllegalStateException("declineLibraryLoan not available");
	}

	@Override
	public void processedRequest() {
		throw new IllegalStateException("processedRequest not available");
	}

	@Override
	public void finishedRequest() {
		System.out.println("Request finished");
	}
}
