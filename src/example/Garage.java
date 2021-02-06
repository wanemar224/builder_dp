package example;

public class Garage {
	private int surface;

	public Garage(int surface) {
		this.surface = surface;
	}

	/**
	 * @return the surface
	 */
	public int getSurface() {
		return surface;
	}

	@Override
	public String toString() {
		return "Garage [surface=" + surface + "]";
	}
}
