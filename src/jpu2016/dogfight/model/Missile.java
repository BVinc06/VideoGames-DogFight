package jpu2016.dogfight.model;

public class Missile extends Mobile {
	public int SPEED = 4 ;
	public int WIDTH = 30;
	public static int HEIGHT = 10;
	public int MAX_DISTANCE_TRAVELED = 1400 ;
	public static String IMAGE = "missile";
	public int distanceTraveled = 0;
	
	public Missile(Direction Direction, Dimension Dimension) {
		super(Direction, null, Dimension, HEIGHT, IMAGE);
	}
	protected int getWidthWithADirection(Direction Direction){
		return WIDTH;
	}
	protected int getHeightWithADirection(Direction Direction) {
		return HEIGHT;
	}
	public void move() {
	}
	public boolean isWeapon() {
		return false;
	}

}