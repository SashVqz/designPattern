public enum DiameterPipe {
	MM125(110), MM250(200), MM315(315), MM500(500), MM1000(1000), MM1500(1200);
	
	private Integer diameter;
	private DiameterPipe(Integer diameter) {
		this.diameter = diameter;
	}
	
	public Integer getDiameter() {
		return diameter;
	}
}
