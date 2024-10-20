public class ColorPipeComponents extends AbstractPipeComponentsDecorator{
	private ColorPipe colorPipe;
	
	public ColorPipeComponents(PipeComponents pipeComponents, ColorPipe colorPipe) {
		super(pipeComponents);
		this.colorPipe = colorPipe;
	}
	
	public String toString() {
		return ", colorpipe: " + this.colorPipe.getColor();
	}
}