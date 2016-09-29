/**
 * Created by alumno on 29/09/16.
 */
public class Sumar implements Expresiones {
    Expresiones expresion1;
    Expresiones expresion2;

    public Sumar(Expresiones e1, Expresiones e2){
        this.expresion1=e1;
        this.expresion2=e2;

    }


    public double evaluar() {
        return (this.expresion1.evaluar() + this.expresion2.evaluar());
    }
}
