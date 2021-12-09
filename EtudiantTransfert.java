public class EtudiantTransfert extends Etudiant{
    private String nomUniversite;

    public EtudiantTransfert(String nom, int annee, String nomSection, String nomUniversite){
        super(nom, annee, nomSection);
        this.nomUniversite = nomUniversite;
    }

    @Override
    public void afficher(){
        System.out.println("Etudiant transfere: ");
        super.afficher();
        System.out.println("\tUni origine: " + nomUniversite);
    }
}
