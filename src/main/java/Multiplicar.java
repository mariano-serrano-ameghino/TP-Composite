/**
 * Created by alumno on 29/09/16.
 */
public class Multiplicar implements Expresiones {
    Expresiones expresion1;
    Expresiones expresion2;

    public Multiplicar(Expresiones expresion1, Expresiones expresion2) {
        this.expresion1 = expresion1;
        this.expresion2 = expresion2;
    }

    public double evaluar() {
        return (this.expresion1.evaluar() * this.expresion2.evaluar());
    }
}
