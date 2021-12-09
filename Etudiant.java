abstract public class Etudiant extends Estien {
    protected String nomSection;

    public Etudiant(String nom, int annee, String nomSection){
        super(nom, annee);
        this.nomSection =nomSection;
    }

    @Override   //La redéfinition
    public void afficher(){
        super.afficher();
        System.out.println("\tSection : " + nomSection);
    }
}
