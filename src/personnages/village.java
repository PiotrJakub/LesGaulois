package personnages;

public class Village {
	private String nom;
	private Chef chef;
	private Gaulois[] villageois;
	private int nbVillageois;

	public void afficherVillageois() {
		// Affiche le nom du chef
		System.out.println("Chef du village : " + chef.getNom());

		// Affiche les noms des villageois
		System.out.println("Villageois : ");
		for (int i = 0; i < nbVillageois; i++) {
		}
	}

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
		Gaulois obelix = new Gaulois("Obelix", 25);
		village.ajouterHabitant(obelix);

		village.afficherVillageois();
	}
}
//Gaulois gaulois = village.trouverHabitant(30);
//l'indice 30 n'est pas definir (0-29)