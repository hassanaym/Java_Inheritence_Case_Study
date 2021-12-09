 public class Enseignant extends Personnel{
    private String nomSection;

    public Enseignant(String nom, int annee, String nomLabInst, String nomSection, int salaire){
        super(nom, annee, nomLabInst, salaire);
        this.nomSection = nomSection;
    }

    @Override
    public void afficher(){
        System.out.println("Enseignant : ");
        super.afficher();
        System.out.println("\tSection: " + nomSection);
    }
}
