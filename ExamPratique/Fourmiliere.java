package ExamPratique;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Iterator;

    public class Fourmiliere {
    private int nbOeufs;
    private int stockNourriture;
    private int nbSalles;
    private ArrayList<Fourmis> fourmis;

    public Fourmiliere(List<Fourmis> listFourmis) {
        Random random = new Random();
        this.nbOeufs = random.nextInt(11) + 10;
        this.stockNourriture = random.nextInt(6) + 15;
        this.nbSalles = random.nextInt(5) + 3;
        this.fourmis = new ArrayList<Fourmis>();

        fourmis.add(new Chasseresse(1,7));
        fourmis.add(new Nourrice(1,3));
        fourmis.add(new Ouvriere(1,5));

        fourmis.add(new Chasseresse(1,8));
        fourmis.add(new Nourrice(1,4));
        fourmis.add(new Ouvriere(1,6));
    }

    public int getNbOeufs() {
        return this.nbOeufs;
    }

    public void setNbOeufs(int nbOeufs) {
        this.nbOeufs = nbOeufs;
    }

    public int getStockNourriture() {
        return this.stockNourriture;
    }

    public void setStockNourriture(int stockNourriture) {
        this.stockNourriture = stockNourriture;
    }

    public int getNbSalles() {
        return this.nbSalles;
    }

    public void setNbSalles(int nbSalles) {
        this.nbSalles = nbSalles;
    }

    public ArrayList<Fourmis> getFourmis() {
        return this.fourmis;
    }

    public void setFourmis(ArrayList<Fourmis> fourmis) {
        this.fourmis = fourmis;
    }

    public void ajouterFourmi(Fourmis fourmi) {
        this.fourmis.add(fourmi);
    }

    public void enleverFourmi(Fourmis fourmi) {
        this.fourmis.remove(fourmi);
    }

        public void action() {
            // Ajouter entre 0 et 10 oeufs
            Random rand = new Random();
            this.nbOeufs += rand.nextInt(6);

            //  Ajouter entre 0 et 5 de nourriture
            for (int i = 0; i < this.fourmis.size(); i++) {
                if (this.stockNourriture > 0) {
                    this.stockNourriture--;
                } else {
                    System.out.println("La fourmilière n'a plus assez de nourriture !");
                }
            }

            // Chaque fourmi effectue son action
            for (Fourmis fourmi : this.fourmis) {
                if (fourmi.getRole().equals("chasseur")) {
                    fourmi.chasser();
                } else if (fourmi.getRole().equals("nurse")) {
                    fourmi.nurse();
                } else if (fourmi.getRole().equals("agrandisseur")) {
                    fourmi.agrandissement();
                }
            }
        }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Nombre d'oeufs : " + this.getNbOeufs() + "\n");
            sb.append("Stock de nourriture : " + this.getStockNourriture() + "\n");
            sb.append("Nombre de salles : " + this.getNbSalles() + "\n");
            sb.append("Fourmis :\n");

            Iterator<Fourmis> iterator = this.getFourmis().iterator();
            while (iterator.hasNext()) {
                Fourmis fourmi = iterator.next();
                sb.append(fourmi.toString() + "\n");
            }
            return sb.toString();
        }

    }

