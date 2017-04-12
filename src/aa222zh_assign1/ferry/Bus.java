package aa222zh_assign1.ferry;


public class Bus extends Vehicle {
	
	public Bus (int p){
		super.setSpaceOcupied(4);
		super.setMax(20);
		super.setFee(200+ 10*p);
		super.setNumberOfPassengers(p);
	}

}
