package springcore;

import java.util.Map;

public class Shop {
	private String name;
	private String loc;
	private Map<Integer,String> products;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Map<Integer, String> getProducts() {
		return products;
	}
	public void setProducts(Map<Integer, String> products) {
		this.products = products;
	}
	
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	@Override
	public String toString() {
		return "Shop [name=" + name + ", loc=" + loc + ", products=" + products + "]";
	}
	
	
	
	
}
