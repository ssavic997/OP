package zad1_1;

public class Krug {
	
	private double r;

	public Krug(double r) {
		super();
		this.r = r;
	}
	
	// Geteri i seteri (izgenerisani)
	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}
	
	// Metoda koja vraća obim
	public double obim() {
		return 2 * r * Math.PI;
	}
	
	// Metoda koja vraća površinu
	public double povrsina() {
		return Math.pow(r, 2) * Math.PI;
	}
	
}
