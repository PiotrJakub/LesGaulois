package personnages;

public class Village {
	private String nom;
	private Chef chef;
	private Gaulois[] villageois;
	private int nbVillageois;

	public Village(String nom, int nbVillageoisMaximum) {
		this.nom = nom;
		villageois = new Gaulois[nbVillageoisMaximum];
		nbVillageois = 0;

	}

	public void setChef(Chef chef) {
		this.chef = chef;
	}

	public void ajouterHabitant(Gaulois gaulois) {
		villageois[nbVillageois] = gaulois;
		nbVillageois++;
	}

	public Gaulois trouverHabitant(int numeroVillageois) {
		return villageois[numeroVillageois];
	}

	public String getNom() {
		return nom;
	}

	public static void main(String[] args) {
		Village village = new Village("Village des Irréductibles", 30);
	}
}
//Gaulois gaulois = village.trouverHabitant(30);
//l'indice 30 n'est pas definir (0-29)