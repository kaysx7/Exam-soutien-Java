package ExamPratique;
import java.util.Random;

public class Nourrice extends Fourmis{
    public Nourrice(int age, int force) {
        super(age, force);
    }

    @Override
    public double deplacement(String environnement) {
        if (environnement.equals("herbe")) {
            return 0.5;
        } else {
            return 1.0;
        }
    }

    @Override
    public String toString() {
        return "Nourrice de " + this.age + " jours et de force " + this.force;
    }

    @Override
    public void nurse() {

    }

    public void nurse(Fourmiliere fourmiliere) {
        if (fourmiliere.getNbOeufs() > 0) {
            // on ajoute une nouvelle fourmi à la fourmilière
            Random random = new Random();
            int type = random.nextInt(3);
            Fourmis fourmi;
            if (type == 0) {
                fourmi = new Chasseresse(0, 5);
            } else if (type == 1) {
                fourmi = new Nourrice(0, 5);
            } else {
                fourmi = new Ouvriere(0, 5);
            }
            fourmiliere.ajouterFourmi(fourmi);
            // on retire un oeuf de la fourmilière
            fourmiliere.setNbOeufs(fourmiliere.getNbOeufs() - 1);
        }
    }
    @Override
    public String getRole() {
        return "Nourrice";
    }

    @Override
    public void chasser() {

    }

    @Override
    public void agrandissement() {

    }

    @Override
    public String getMessage() {
        return null;
    }
    // public void nurse(Fourmiliere fourmiliere) {


}
