package springcore;

import java.util.List;

public class Library {
	String name;
	String loc;
	List<String> books;
	public Library(String name, String loc, List<String> books) {
		super();
		this.name = name;
		this.loc = loc;
		this.books = books;
	}
	@Override
	public String toString() {
		return "Library [name=" + name + ", loc=" + loc + ", books=" + books + "]";
	}
	
	
	
	
}
