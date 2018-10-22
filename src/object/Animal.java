package object;

import util.Sexe;

/**
 * Animal Class
 * @author formation
 *
 */
public class Animal {
		
		/**
		 * Animal attributes
		 */
		private String race = "";
		private String surnom = "";
		private Sexe genre = null;
		private int numTatouage = 0;
		private Animal partenaire = null;
		
		/**
		 * @param race
		 * @param surnom
		 * @param genre
		 * @param numTatouage
		 */
		public Animal(String race, String surnom, Sexe genre, int numTatouage) {
			super();
			this.race = race;
			this.surnom = surnom;
			this.genre = genre;
			this.numTatouage = numTatouage;
		}
		
		/**
		 * Animal coupling method (race has to be the same and genre strictly different)
		 * @param partenaire
		 */
		public void accoupler(Animal partenaire) {
			if (this.race.equalsIgnoreCase(partenaire.race))
			{
				if(this.genre == Sexe.Male && partenaire.getGenre() == Sexe.Femelle)
				{
					this.partenaire = partenaire;
					partenaire.partenaire = this.partenaire;
				}
				else
				{
					System.err.println("l'Animal Femelle ne peut être la source de l'accouplement");
				}
			}
			else
			{
				System.err.println("l'Animal ne peut s'accoupler car sa race est differente");
			}
		}

		/**Animal Genre getter
		 * @return the genre
		 */
		public Sexe getGenre() {
			return genre;
		}
		
		@Override
		public String toString() {
			String toString = "Animal [n°Tatouage="+this.numTatouage+
							  " Surnom="+this.surnom+
							  " Race="+this.race+
							  " Sexe="+this.genre;
			
			//Handle case where partner is null
			if(this.genre == Sexe.Male)
			{
				toString += " Partenaire="+((this.partenaire!=null)?this.partenaire:"Aucun!")+"]";
			}
			else
			{
				toString += " ]";
			}
			
			return toString;
							
		}
}
