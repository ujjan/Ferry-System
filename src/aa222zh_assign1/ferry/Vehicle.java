package aa222zh_assign1.ferry;

public abstract class Vehicle {
	
	private int numberOfPassengers;
	
	private  double  spaceOcupied;
	private int fee;
	private int max;
	private String carNumber;
	
	public void setMax(int n){
		max = n;
	}
	public int getMax(){
		return max;
	}
	public  void setNumberOfPassengers(int n){
		if (n<0 || n>max){
			throw new IllegalArgumentException("out of limit passengers !");
		}
		else 
			numberOfPassengers = n;
	}
	public int getNumberOfPassengers(){
		return this.numberOfPassengers;
	}
	public void setSpaceOcupied(double d){
		this.spaceOcupied = d;
		
	}
	public double getSpaceOcupied(){
		return spaceOcupied;
	}
	public void setFee(int f ){
	this.fee = f;
	}
	public int getFee(){
		return this.fee;
	}
	public void setCarNumber(String n){
		this.carNumber = n;
	}
	public String getCarNumber(){
		return this.carNumber;
	}
}
