package springcore;

public class Car {
	private Engine eng;
	public void start() {
		System.out.println("car is starting");
		eng.run();
	}
	public Engine getEng() {
		return eng;
	}
	public void setEng(Engine eng) {
		this.eng = eng;
	}
}
