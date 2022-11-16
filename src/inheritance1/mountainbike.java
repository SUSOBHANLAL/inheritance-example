package inheritance1;

class mountainbike extends bicycle {
	public  int seatHeight;

	public mountainbike(int startSpeed,int startGear,int startHeight) {
     	super(startSpeed,startGear);
//		
	this.seatHeight = startHeight;
		
	}
	
	// provide methods name 
	public void setSeatheight(int newvalue) {
		seatHeight = newvalue;
	}

}
