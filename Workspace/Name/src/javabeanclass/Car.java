package javabeanclass;

public class Car implements Comparable
{
	private String colour;
	private String engine;
	private String model;
	private double price;
	private double yom;
	private Car(String colour,String engine,String model,double price,double yom)
	{
		this.colour=colour;
		this.engine=engine;
		this.model=model;
		this.price=price;
		this.yom=yom;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getEngine() {
		return engine;
	}
	public void setEngine(int engine) {
		this.engine = engine;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getYom() {
		return yom;
	}
	public void setYom(double yom) {
		this.yom = yom;
	}
	@Override
	public int compareTo(Object o) {
		Car ref = (Car) o;
		return this.model.compareTo(ref.model);
	}
	public static void main(String[] args) {
		Car ref=new Car("White","Petrol","Maruti Swift Dezire",1000000.00,2010);
		Car ref1=new Car("Black","Dual","Celerio",2000000.00,2000);
		Car ref2=new Car("Blue","Gas","Innova",3000000.00,2012);
		Car ref3=new Car("Red","Diesel","Benz",4000000.00,2011);
		ref.compareTo(ref2);
	}	
}

