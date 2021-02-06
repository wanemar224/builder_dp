package example;

public class Maison {
	private final int pieces; // obligatoire
	private final Brique brique; // obligatoire
	private final Toit toit; // obligatoire

	private final Couleur peinture; // optionnel
	private final Picine picine; // optionnel
	private final Garage garage; // optionnel

	// etc...

	private Maison(MaisonBuilder builder) {
		this.pieces = builder.pieces;
		this.brique = builder.brique;
		this.toit = builder.toit;

		this.peinture = builder.peinture;
		this.garage = builder.garage;
		this.picine = builder.picine;
	}

	/**
	 * @return the pieces
	 */
	public int getPieces() {
		return pieces;
	}

	/**
	 * @return the brique
	 */
	public Brique getBrique() {
		return brique;
	}

	/**
	 * @return the toit
	 */
	public Toit getToit() {
		return toit;
	}

	/**
	 * @return the peinture
	 */
	public Couleur getPeinture() {
		return peinture;
	}

	/**
	 * @return the picine
	 */
	public Picine getPicine() {
		return picine;
	}

	/**
	 * @return the garage
	 */
	public Garage getGarage() {
		return garage;
	}
	
	
	@Override
	public String toString() {
		return "Maison [pieces=" + pieces + ", brique=" + brique + ", toit=" + toit + ", peinture=" + peinture
				+ ", picine=" + picine + ", garage=" + garage + "]";
	}


	public static class MaisonBuilder {
		private int pieces; // obligatoire
		private Brique brique; // obligatoire
		private Toit toit; // obligatoire

		private Couleur peinture; // optionnel
		private Picine picine; // optionnel
		private Garage garage; // optionnel

		public MaisonBuilder(int pieces, Brique brique, Toit toit) {
			this.brique = brique;
			this.pieces = pieces;
			this.toit = toit;
		}

		/**
		 * @param peinture the peinture to set
		 */
		public MaisonBuilder peinture(Couleur peinture) {
			this.peinture = peinture;
			return this;
		}

		/**
		 * @param avecGarage the avecGarage to set
		 */
		public MaisonBuilder garage(Garage garage) {
			this.garage = garage;
			return this;
		}

		/**
		 * @param avecPicine the avecPicine to set
		 */
		public MaisonBuilder picine(Picine picine) {
			this.picine = picine;
			return this;
		}

		public Maison build() {
			Maison maison = new Maison(this);
			this.validateMaisonObject(maison);
			return maison;
		}

		private void validateMaisonObject(Maison maison) {
			// Do some basic validations to check
			// if user object does not break any assumption of system
		}
	}
}
