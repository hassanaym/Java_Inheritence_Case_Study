//Classe abstraite est classe qui ne peut pas être instanciée
abstract class Estien{
    protected String nom;
    protected int annee;
    //private  --> class
    //public   --> all
    //protected   --> sub classes 
    //default    -->same package

    public Estien(String nom, int annee){
        this.nom = nom;
        this.annee = annee;
    }

    public void afficher(){
        System.out.println("\tNom: " + nom);
        System.out.println("\tAnnee: " + annee);
    }
}