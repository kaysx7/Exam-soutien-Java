package ExamPratique;

public abstract class Fourmis {

    protected int age;
    protected int force;

    public Fourmis(int age, int force) {
      this.age = age;
      this.force = force;
    }

    public void communication(Fourmis autreFourmi) {
        System.out.println("La fourmi de " + this.age + " jours et de force " + this.force + " communique avec la fourmi de " + autreFourmi.age + " jours et de force " + autreFourmi.force);
    }

    public abstract double deplacement(String environnement);

    public abstract void nurse();

    public abstract String getRole();
    public abstract void chasser();
    public abstract void agrandissement();

    public abstract String getMessage();
}
// Compare this snippet from ExamPratique/Fourmiliere.java: