package springcore;

import java.util.Map;

public class Resturant {
	String name;
	String location;
	Map<Integer, String> dishes;
	public Resturant(String name, String location, Map<Integer, String> dishes) {
		this.name = name;
		this.location = location;
		this.dishes = dishes;
	}
	@Override
	public String toString() {
		return "Resturant [name=" + name + ", location=" + location + ", dishes=" + dishes + "]";
	}	
}
