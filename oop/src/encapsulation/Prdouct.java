package encapsulation;

public class Prdouct {
	private String name;
	private double price;

		public void setName(String name) {
			this.name=name;
		}
	
	public String getName() {
		return name;
	}
	public void setPrice(double price) throws IllegalAccessException {
	
		if (price>0) {
		this.price=price;
	}
	else 
		
	{
		throw new IllegalAccessException("price must be positive");
		}
		
}
public double getPrice() {
    return price;	 
 }
 }


