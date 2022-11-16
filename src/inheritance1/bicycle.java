package inheritance1;

public class bicycle {
	protected int gear;
	protected int speed;

	public bicycle(int startSpeed, int startGear) {
		
		// TODO Auto-generated constructor stub
		gear = startGear;
		speed = startSpeed;
	}
	
	public void setGEar(int gearvalue) {
		gear =gearvalue;
	}
	public void applyBarake(int decrement) {
		speed = speed - decrement;
	}
	
	// another method 
	public void Speedp(int increment )
	{
		speed = speed +increment;
	}

}
