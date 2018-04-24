package jpu2016.dogfight.model;

public interface IDogfightModel {
	
	public default void getArea() {
		return;
	}
	
	public default void buildArea(Dimension Dimension) {
		return;
	}
	public default void addMobile(Mobile IMobile) {
		return;
	}
	public default void removeMobile(Mobile IMobile) {
		return;
	}
	public default void getMobiles(){
		return;
	}
	public default void getMobileByPlayer(int player){
		return;
	}
	public default void setMobilesHavesMoved() {
		return;
	}
}