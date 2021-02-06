package example;

public class Picine {
	private double profondeur;
	private String forme;
	
	public Picine(double profondeur, String forme) {
		this.profondeur = profondeur;
		this.forme = forme;
	}

	/**
	 * @return the profondeur
	 */
	public double getProfondeur() {
		return profondeur;
	}

	/**
	 * @return the forme
	 */
	public String getForme() {
		return forme;
	}

	@Override
	public String toString() {
		return "Picine [profondeur=" + profondeur + ", forme=" + forme + "]";
	}
	
}
