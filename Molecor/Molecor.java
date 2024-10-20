package com.utad.Fiis.DS.Molecor;

/*
 * Singleton with static instantiation
 * Facade
 */

public class Molecor {
	// Singleton requirements
	private static Molecor molecor = new Molecor();
	private Molecor() {}

	public static Molecor getInstance() {
		return molecor;
	}

	// Applying the facade pattern
	public void processMolecorRequest(MolecorRequestContext molecorRequestContext) {
		molecorRequestContext.process();
	}
}
