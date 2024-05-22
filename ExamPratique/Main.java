package ExamPratique;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // la liste de fourmis
        List<Fourmis> listFourmis = new ArrayList<>();
        listFourmis.add(new Chasseresse(2, 10));
        listFourmis.add(new Nourrice(1, 8));
        listFourmis.add(new Ouvriere(3, 7));

        // Création de la fourmilière
        Fourmiliere fourmiliere = new Fourmiliere(listFourmis);

        // Affichage des informations initiales de la fourmilière
        System.out.println("Informations initiales de la fourmilière :");
        System.out.println(fourmiliere);

        // Action sur la fourmilière
        fourmiliere.action();

        // Affichage des informations après action sur la fourmilière
        System.out.println("\nInformations après action sur la fourmilière :");
        System.out.println(fourmiliere);
    }
}