package personnages;



public class Humain {
		private String nom;
		private String boisson;
		private int argent;
		public String getNom() {
			return nom;
		}
		public int getArgent() {
			return argent;
		}
		public void setBoisson(String boisson) {
			this.boisson = boisson;
		}
		public void setArgent(int argent) {
			this.argent = argent;
		}
		public Humain(String nom, String boisson, int argent) {
			this.nom=nom;
			this.boisson=boisson;
			this.argent=argent;
		}
		public void gagnerArgent(int montant) {
			argent+=montant;
		}
		public void perdreArgent(int montant) {
			argent-=montant;
		}
		protected void parler(String texte) {
			System.out.println("("+nom+")-" +  texte );
		}
		public void direBonjour() {
			parler("Bonjour ! Je m'appelle " + nom + " et j'aime boire de " + boisson);
		}
		public void boire() {
			parler("Mmmmm ! Un bon verre de " + boisson + " ! GLOUPsSsS !" );
		}
		public void acheter(String bien,int prix) {
			if (prix>argent) {
				parler("J'ai malheuresement plus que " + argent + " sous en poche. Impossible de m'offrir " + bien +" à " + prix +" sous.");
			}
			else {
				parler("J'ai "+argent+" sous en poche. Je vais pouvoir m'offrir "+bien+" à "+prix+" sous");
				perdreArgent(prix);
			}
		}	
	
		
}
