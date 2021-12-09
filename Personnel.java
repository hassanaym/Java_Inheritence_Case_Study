abstract public class Personnel extends Estien{
    protected String nomLabInst;
    protected int salaire;

    public Personnel(String nom, int annee, String nomLabInst, int salaire){
        super(nom, annee);
        this.nomLabInst = nomLabInst;
        this.salaire=  salaire;
    }

    @Override
    public void afficher(){
        super.afficher();
        System.out.println("\tSalaire: " + salaire);
        System.out.println("\tLaboratoir: " + nomLabInst);
    }
}
