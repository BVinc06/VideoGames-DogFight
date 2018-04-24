package jpu2016.dogfight.model;

public class Position {
	private double x;
	private double y;
	private double maxX;
	private double maxY;
	
	public Position(double x, double y, double maxX, double maxY) {
		return;
	}
	
	public Position(Position position) {
		return;
	}
	
	protected double getX() {
		return x;
	}
	protected void setX(double x) {
		this.x = x;
	}
	protected double getY() {
		return y;
	}
	protected void setY(double y) {
		this.y = y;
	}

	public double getMaxX() {
		return maxX;
	}

	public void setMaxX(double maxX) {
		this.maxX = maxX;
	}

	public double getMaxY() {
		return maxY;
	}

	public void setMaxY(double maxY) {
		this.maxY = maxY;
	}

}
