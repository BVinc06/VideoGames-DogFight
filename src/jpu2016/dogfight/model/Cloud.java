package jpu2016.dogfight.model;

public class Cloud extends Mobile {
	public int SPEED = 1 ;
	public int WIDTH = 300;
	public static int HEIGHT = 150;
	public static String IMAGE = "cloud";
	
	public Cloud(Direction Direction, Dimension Dimension) {
		super(Direction, null, Dimension, HEIGHT, IMAGE);
	}
}