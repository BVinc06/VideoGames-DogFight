package jpu2016.dogfight.model;

public class Mobile implements IMobile {
	private int speed;

	public Mobile(Direction Direction, Position Position, Dimension Dimension, int speed, String image) {
	}
	
	public void moveUp() {
	}
	public void moveRight() {
	}
	public void moveDown() {
	}
	public void moveLeft() {
	}
	
	
	@Override
	public void getDirection() {
		// TODO Auto-generated method stub
		IMobile.super.getDirection();
	}

	@Override
	public void setDirection(Direction Direction) {
		// TODO Auto-generated method stub
		IMobile.super.setDirection(Direction);
	}

	@Override
	public void getPosition() {
		// TODO Auto-generated method stub
		IMobile.super.getPosition();
	}

	@Override
	public void getDimension() {
		// TODO Auto-generated method stub
		IMobile.super.getDimension();
	}

	@Override
	public void getWidth() {
		// TODO Auto-generated method stub
		IMobile.super.getWidth();
	}

	@Override
	public void getHeight() {
		// TODO Auto-generated method stub
		IMobile.super.getHeight();
	}

	@Override
	public void getSpeed() {
		// TODO Auto-generated method stub
		IMobile.super.getSpeed();
	}

	@Override
	public void getImage() {
		// TODO Auto-generated method stub
		IMobile.super.getImage();
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		IMobile.super.move();
	}

	@Override
	public void placeInArea(IArea aera) {
		// TODO Auto-generated method stub
		IMobile.super.placeInArea(aera);
	}

	@Override
	public boolean isPlayer(int player) {
		// TODO Auto-generated method stub
		return IMobile.super.isPlayer(player);
	}

	@Override
	public void setDogfightModel(DogfightModel dogfightModel) {
		// TODO Auto-generated method stub
		IMobile.super.setDogfightModel(dogfightModel);
	}

	@Override
	public boolean hit() {
		// TODO Auto-generated method stub
		return IMobile.super.hit();
	}

	@Override
	public boolean isWeapon() {
		// TODO Auto-generated method stub
		return IMobile.super.isWeapon();
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
	
}