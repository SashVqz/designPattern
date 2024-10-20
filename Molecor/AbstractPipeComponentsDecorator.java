public class AbstractPipeComponentsDecorator implements PipeComponentsDecorator {
	protected PipeComponents pipeComponents; 

	public AbstractPipeComponentsDecorator(PipeComponents pipeComponents) {
		super();
		this.pipeComponents = pipeComponents;
	}

	@Override
	public String getDescription() {
		return this.pipeComponents.getDescription() + this.toString();
	}

	@Override
	public PipeComponents getPipeComponents() {
		return this.pipeComponents;
	}
}
