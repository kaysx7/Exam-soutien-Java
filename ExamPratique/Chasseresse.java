package ExamPratique;

public class Chasseresse extends Fourmis {

    private static int compteur = 0;
    private int numero;

    public Chasseresse(int age, int force) {
        super(age, force);
        this.numero = compteur;
        compteur++;
    }

    @Override
    public double deplacement(String environnement) {
        return this.force;
    }

    @Override
    public String toString() {
        return "Chasseresse de " + this.age + " jours et de force " + this.force + " (numéro " + this.numero + ")";
    }
    // méthode pour chasser



    public void chasser(Fourmiliere fourmiliere) throws ExceptionNourriture {
        fourmiliere.setStockNourriture(fourmiliere.getStockNourriture() + this.force); // on augmente le stock de nourriture
        if (fourmiliere.getStockNourriture() > fourmiliere.getNbSalles() * 10) {
            throw new ExceptionNourriture ();
        }
    }
    // méthode pour agrandir la fourmilière

    @Override
    public String getRole() {
        return "Chasseresse";
    }

    @Override
    public void chasser() {

    }
    @Override
    public void nurse() {

    }

    @Override
    public void agrandissement() {

    }

    @Override
    public String getMessage() {
        return "La chasseresse " + this.numero + " a travaillé pour rien !";
    }
}
// Compare this snippet from ExamPratique/Fourmiliere.java: