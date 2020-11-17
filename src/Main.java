import java.util.*;

public class Main {

    public static void main(String[] args) {

        ArrayList<Stagiaire> stagiaires = new ArrayList<>();
        stagiaires.add(new Stagiaire("ADC", "nbc", 22));
        stagiaires.add(new Stagiaire("BDC", "ebc", 12));
        stagiaires.add(new Stagiaire("ZDC", "ibc", 72));
        stagiaires.add(new Stagiaire("ADC", "afc", 42));
        stagiaires.add(new Stagiaire("AUC", "abc", 99));

        stagiaires.sort(new Stagiaire.StagiaireAgeComparator());

        for (Stagiaire stagiaire: stagiaires) {
            System.out.println(stagiaire);
        }

    }

}
