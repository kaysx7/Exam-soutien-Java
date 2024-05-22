package ExamPratique;

public class ExceptionNourriture extends Exception {
    private int numero;

    public void ExceptionNourritures(int numero) {
        this.numero = numero;
    }
    @Override
    public String getMessage() {
        return "La chasseresse " + this.numero+ " a travaillé pour rien !";
    }


}
