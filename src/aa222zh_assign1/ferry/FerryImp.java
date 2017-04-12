package aa222zh_assign1.ferry;

import java.util.ArrayList;
import java.util.Iterator;

public class FerryImp implements Ferry {
	ArrayList<Vehicle> list = new ArrayList<Vehicle>();
	ArrayList<Passenger> list2 = new ArrayList();

	int money = 0;
	int passengers = 0;

	final int MAXIMUM_NUMBER_OF_PASSENGERS = 200;
	final double MAXIMUM_SPACES = 40;

	@Override
	public int countPassengers() {
		int count = 0;
		Iterator<Vehicle> it = this.iterator();

		while (it.hasNext()) {
			Vehicle v = it.next();
			count += v.getNumberOfPassengers();
		}
		count += list2.size();
		if (count == 197){
			System.out.println("here");
		}
		return count;
	}

	@Override
	public int countVehicleSpace() {
		// TODO Auto-generated method stub
		double space = 0;
		Iterator<Vehicle> it = this.iterator();

		while (it.hasNext()) {
			Vehicle v = it.next();
			space += v.getSpaceOcupied();

		}
		return (int) Math.ceil(space);
	}

	@Override
	public int countMoney() {
		int fee = 0;
		Iterator<Vehicle> it = this.iterator();

		while (it.hasNext()) {
			Vehicle v = it.next();
			fee += v.getFee();

		}
		fee += money;

		return fee;
	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return new VehicleIterator();
	}

	@Override
	public void embark(Vehicle v) {
		// TODO Auto-generated method stub
		if (this.hasSpaceFor(v)) {
			if (!list.contains(v))
				list.add(v);
			else
				throw new RuntimeException("Vehicle already exists!");
		} else
			throw new RuntimeException("No place for Vehicle!");

	}

	@Override
	public void embark(Passenger p) {
		// TODO Auto-generated method stub
		if (this.hasRoomForPassenger()) {
			list2.add(p);
			money += 20;
		} else 
			throw new RuntimeException("No place for Passenger!");

	}

	@Override
	public void disembark() {
		// TODO Auto-generated method stub
		list.clear();
		list2.clear();
	}

	@Override
	public boolean hasSpaceFor(Vehicle v) {
		if ((this.countVehicleSpace()+ v.getSpaceOcupied()) <= MAXIMUM_SPACES) {
			return true;
		} else
			return false;
	}

	@Override
	public boolean hasRoomForPassenger() {
		// TODO Auto-generated method stub
		if (this.countPassengers() < MAXIMUM_NUMBER_OF_PASSENGERS) {
			return true;
		}
		return false;
	}

	class VehicleIterator implements Iterator<Vehicle> {

		int index = 0;

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return list.size() > index;
		}

		@Override
		public Vehicle next() {
			// TODO Auto-generated method stub
			Vehicle v = list.get(index);
			index++;
			return v;
		}

	}

}
