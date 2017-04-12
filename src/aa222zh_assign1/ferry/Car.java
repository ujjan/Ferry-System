package aa222zh_assign1.ferry;


public class Car extends Vehicle {
	public Car (int p, String n){
		super.setSpaceOcupied(1);
		super.setMax(4);
		super.setFee(100+ 15*p);
		super.setCarNumber(n);
		super.setNumberOfPassengers(p);

	}

}
