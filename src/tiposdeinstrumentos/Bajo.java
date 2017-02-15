
package tiposdeinstrumentos;

import serenata.Instrumento;

public class Bajo extends Instrumento{
    
    @Override
    public void nombrar() {
        setNombre("bajo");
    }
    @Override
    public void afinar() {
        System.out.println("* afinando Bajo");
    }

    @Override
    public void tocar() {
        System.out.println("* tocando bajo");
    }    
}
