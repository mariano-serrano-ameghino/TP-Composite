/**
 * Created by alumno on 29/09/16.
 */
public class Constante implements Expresiones {
    double valor;

    public Constante(double i){

        this.valor = i;
    }

    public double evaluar(){
        return valor;
    }
}
