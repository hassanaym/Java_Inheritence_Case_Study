public class Secretaire extends Personnel{
    

    public Secretaire(String nom, int annee, String nomLabInst, int salaire){
        super(nom, annee, nomLabInst, salaire);
    }

    @Override
    public void afficher(){
        System.out.println("Secretaire : ");
        super.afficher();
    }
}
