package com.utad.Fiis.DS.Molecor;

// Test of the state, observer, strategy, decorator, singleton, and facade patterns

public class TestMolecorRequest {
	public static void main(String[] args) {
		Molecor molecor = Molecor.getInstance();
		
		MolecorPipe molecorPipe = new MolecorPipe();        
		molecorPipe.setPipeComponents(new DiameterPipeComponents(molecorPipe.getPipeComponents(), DiameterPipe.MM1500));        
		molecorPipe.setPipeComponents(new ColorPipeComponents(molecorPipe.getPipeComponents(), ColorPipe.BLUE));
		
		MolecorCustomer sash = new MolecorCustomer("Sash Bazquez", true);
		
		MolecorRequestContext molecorRequestContext = new MolecorRequestContext(sash, molecorPipe, molecor);
		
		molecor.processMolecorRequest(molecorRequestContext);
		molecor.processMolecorRequest(molecorRequestContext);
		molecor.processMolecorRequest(molecorRequestContext);
	}
}
