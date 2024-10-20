public enum ColorPipe {
	BLUE("blue"), PURPLE("purple");
	
	private String color;
	private ColorPipe(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
}
