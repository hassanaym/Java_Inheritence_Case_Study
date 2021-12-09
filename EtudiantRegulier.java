public class EtudiantRegulier extends Etudiant{
    private double moyenne;

    public EtudiantRegulier(String nom, int annee, String nomSection, double moyenne){
        super(nom, annee, nomSection);
        this.moyenne = moyenne;
    }

    @Override
    public void afficher(){
        System.out.println("Etudiant regulier: ");
        super.afficher();
        System.out.println("\tMoyenne: " + moyenne);
    }
}