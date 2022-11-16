package inheritance1;

class veichle {

	public static void main(String []args) {
		
		// give the value to the constructor of mountain bike 
		mountainbike mbike = new mountainbike(10,16,3);
		System.out.println(  "gear is : "+mbike.gear);
		System.out.println("the speed is "+mbike.speed);
		System.out.println("the seathight is :"+mbike.seatHeight);
		mbike.applyBarake(1);
		
		
	}
}
