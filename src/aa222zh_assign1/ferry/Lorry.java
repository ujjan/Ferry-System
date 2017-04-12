package aa222zh_assign1.ferry;

public class Lorry extends Vehicle {
	public Lorry (int p){
		super.setSpaceOcupied(8);
		super.setMax(2);
		super.setFee(300 +15*p);
		super.setNumberOfPassengers(p);
	}

}
