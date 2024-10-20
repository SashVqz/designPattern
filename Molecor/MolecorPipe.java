package com.utad.Fiis.DS.Molecor;

public class MolecorPipe {
	private PipeComponents pipeComponents;
	
	public MolecorPipe() {
		this.pipeComponents= new TypePipeComponentt(TypePipe.PVC_O);
	}

	public MolecorPipe(PipeComponents pipeComponents) {
		super();
		this.pipeComponents = pipeComponents;
	}
	
	public PipeComponents getPipeComponents() {
		return pipeComponents;
	}

	public void setPipeComponents(PipeComponents pipeComponents) {
		this.pipeComponents = pipeComponents;
	}
	
	@Override
	public String toString() {
		return "MolecorPipe ["+ this.pipeComponents.getDescription() + "]";
	}
}
