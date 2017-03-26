// https://github.com/MeMyYo/tareasAyudantia/tree/Tarea01
package calculadora.v03;

/**
 *
 * @author Jorge
 */
public class TestPGA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MaquinaPGA.preguntar();
        MaquinaPGA.crearArreglo();
        MaquinaPGA peje = new MaquinaPGA();
        peje.guardarArreglo();
        peje.formPGA();
    }
    
}

