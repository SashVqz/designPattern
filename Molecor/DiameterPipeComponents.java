public class DiameterPipeComponents extends AbstractPipeComponentsDecorator {
	private DiameterPipe diameterPipe;
	
	public DiameterPipeComponents(PipeComponents pipeComponents, DiameterPipe diameterPipe) {
		super(pipeComponents);
		this.diameterPipe = diameterPipe;
	}

	@Override
	public String toString() {
		return ", diameterPipe: " + this.diameterPipe.getDiameter() + "mm";
	}
}
