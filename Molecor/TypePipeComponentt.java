package com.utad.Fiis.DS.Molecor;

public class TypePipeComponentt implements PipeComponents{
	private String description;
	private TypePipe typePipe;
	
	public TypePipeComponentt(TypePipe typePipe) {
		super();
		this.typePipe=typePipe;
		this.description=this.typePipe.getType();
	}

	public void setTypePipe(TypePipe typePipe) {
		this.typePipe = typePipe;
	}
	
	@Override
	public String getDescription() {
		return this.description;
	}

	@Override
	public String toString() {
		return "TypePipeComponentt --- Type: " + description;
	}
}
