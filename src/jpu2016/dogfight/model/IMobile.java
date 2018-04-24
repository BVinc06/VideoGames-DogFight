package jpu2016.dogfight.model;

public interface IMobile {
	public default void getDirection() {
		return;
	}
	public default void setDirection(Direction Direction) {
		return;
	}
	public default void getPosition() {
		return;
	}
	public default void getDimension() {
		return;
	}
	public default void getWidth() {
		return;
	}
	public default void getHeight() {
		return;
	}
	public default void getSpeed() {
		return;
	}
	public default void getImage() {
		return;
	}
	public default void move() {
		return;
	}
	public default void placeInArea(IArea aera) {
		return;
	}
	public default boolean isPlayer(int player) {
		return false;
	}
	public default void setDogfightModel(DogfightModel dogfightModel) {
		return;
	}
	public default boolean hit() {
		return false;
	}
	public default boolean isWeapon() {
		return false;
	}

}
