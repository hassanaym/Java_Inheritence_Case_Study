import java.util.ArrayList;
import java.util.Calendar;

public class Start {
    public static void main(String[] args ){
        ArrayList<Estien> est = new ArrayList<Estien>();

        est.add(new EtudiantRegulier("Hassan", 2019, "GI", 19.9)); 
        est.add(new EtudiantRegulier("Sara", 2020, "TM", 18.9));
        est.add(new Enseignant("Sara", 2010, "IBM", "GIM", 30000));
        est.add(new Secretaire("Sara", 2020, "ITT", 5000));
        est.add(new EtudiantTransfert("Sara", 2009, "TM", "DAKAR"));

        System.out.print("Parmi les " + est.size() + " Estiens, ");

        int ne = 0;
        for (Estien e : est) {
            if (e instanceof Etudiant) ne ++;
        }

        System.out.println(ne +" sont des etudiants");


        int ta = 0;

        int anneeAct = Calendar.getInstance().get(Calendar.YEAR);

        for (Estien e : est) {
            ta = ta + (anneeAct - e.annee);

        }
        
        System.out.println("Il sont a l'EST depuis en moyenne " + ta/est.size() +" annee");

        for (Estien e : est) {
            e.afficher();
        }

    }
}
