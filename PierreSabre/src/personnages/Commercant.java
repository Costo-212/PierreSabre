package personnages;

public class Commercant extends Humain {

    public Commercant(String nom, String boisson, int argent) {
        super(nom,boisson,argent);
        setBoisson("thé");
    }
    public int SeFaireExtorquer() {
    	int temp=getArgent();
    	parler("J'ai tout perdu! Le monde est vraiment trop injuste...");
		setArgent(0);
		return temp;
	}
    public void recevoir(int argent) {
    	parler(argent+" sous ! Je te remercie chaleuresement généreux donateur!");
		gagnerArgent(argent);
	}
    
}