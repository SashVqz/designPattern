package com.utad.Fiis.DS.Molecor;

// Test of the Decorator pattern

public class TestPipe {
	public static void main(String[] args) {
		MolecorPipe molecorPipe = new MolecorPipe();
		
		System.out.println(molecorPipe.getPipeComponents().getDescription());
		
		molecorPipe.setPipeComponents(new DiameterPipeComponents(molecorPipe.getPipeComponents(), DiameterPipe.MM315));
		System.out.println(molecorPipe.getPipeComponents().getDescription());
		
		molecorPipe.setPipeComponents(new ColorPipeComponents(molecorPipe.getPipeComponents(), ColorPipe.PURPLE));
		System.out.println(molecorPipe.getPipeComponents().getDescription());
		
		System.out.println(molecorPipe.toString());
	}
}
