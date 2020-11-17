import java.util.Comparator;

public class Stagiaire {

    private String nom, prenom;
    private int age;

    public Stagiaire(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Stagiaire{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", age=" + age +
                '}';
    }

    public static class StagiaireAgeComparator implements Comparator<Stagiaire> {

        @Override
        public int compare(Stagiaire stagiaire1, Stagiaire stagiaire2) {
            return stagiaire1.getAge() - stagiaire2.getAge();
        }

    }

    public static class StagiaireNameComparator implements Comparator<Stagiaire> {

        @Override
        public int compare(Stagiaire stagiaire1, Stagiaire stagiaire2) {
            int compareNomResult = stagiaire1.getNom().compareTo(stagiaire2.getNom());
            if (compareNomResult != 0){
                return compareNomResult;
            }
            else{
                int comparePrenomResult = stagiaire1.getPrenom().compareTo(stagiaire2.getPrenom());
                return compareNomResult + comparePrenomResult;
            }

        }

    }


}
