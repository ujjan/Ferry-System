package aa222zh_assign1.ferry;


public class FerryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FerryImp ferry = new FerryImp();
		
		Car c = new Car(3, "abc");
		
		ferry.embark(c);
		ferry.embark(new Car(1, "ab"));
    	ferry.embark(new Lorry(1));
		ferry.embark(new Passenger());
		ferry.embark(new Lorry(1));
		ferry.embark(new Lorry(1));
		ferry.embark(new Lorry(1));
		ferry.embark(new Lorry(1));
		//for (int i=0; i<170; i++)
		
			ferry.embark(new Passenger());
			//ferry.disembark();
		System.out.println(ferry.countMoney() +"  "+ ferry.countPassengers());
		
	}

}
