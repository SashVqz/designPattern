package com.utad.Fiis.DS.Molecor;

public enum TypePipe {
	PVC_O("PVC-O"), PVC_U("PVC-U");
	
	private String type;
	private TypePipe(String type) {
		this.type = type;
	}
	
	public String getType() {
		return type;
	}
}
