package jpu2016.dogfight.model;

public class Dimension {
	private int width;
	private int height;
	
	
	public Dimension(int width, int height) {
		return;
	}
	
	public Dimension(Dimension dimension) {
		return;
	}
	
	protected int getWidth() {
		return width;
	}
	protected void setWidth(int width) {
		this.width = width;
	}
	protected int getHeight() {
		return height;
	}
	protected void setHeight(int height) {
		this.height = height;
	}
}