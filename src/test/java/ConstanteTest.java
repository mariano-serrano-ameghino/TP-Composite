import org.junit.Assert;
import org.junit.Test;

/**
 * Created by alumno on 29/09/16.
 */
public class ConstanteTest {
    @Test
    public void constanteclase(){
        Constante uno = new Constante(1);
        Constante dos = new Constante(2);

        Assert.assertEquals(1,uno.evaluar(),0);
        Assert.assertEquals(2,dos.evaluar(),0);
    }

    @Test
    public void constanteclase2(){
        Constante uno = new Constante(1);
        Constante dos = new Constante(2);
        Sumar sumarUnoMasDos = new Sumar(uno,dos);
        Sumar sumaTotal = new Sumar(sumarUnoMasDos,dos);
        Assert.assertEquals(3, sumarUnoMasDos.evaluar(),0);
        Assert.assertEquals(5, sumaTotal.evaluar(),0);
    }

    @Test
    public void multiplicarYSumar(){
        Constante uno = new Constante(1);
        Constante dos = new Constante(2);
        Constante cinco = new Constante(5);
        Constante tres = new Constante(3);

        Sumar sumarUnoMasDos = new Sumar(uno,dos);
        Multiplicar mul5y3 = new Multiplicar(cinco,tres);

        Resta total = new Resta(mul5y3, sumarUnoMasDos);

        Assert.assertEquals(12,total.evaluar(),0);
    }
}
