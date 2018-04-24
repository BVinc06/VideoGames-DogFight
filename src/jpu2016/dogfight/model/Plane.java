package jpu2016.dogfight.model;

public class Plane extends Mobile {
	public int SPEED = 2 ;
	public int WIDTH = 100;
	public int HEIGHT = 30;
	public int player;
	
	public Plane(int player, Direction Direction, Position Position, String image) {
		super(player, Direction, Position, image);
	}
	
	public boolean isPlayer(int player) {
		return false;
	}
	
	public boolean hit() {
		return false;
	}
}