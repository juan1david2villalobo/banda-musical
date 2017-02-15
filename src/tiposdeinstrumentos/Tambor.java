package tiposdeinstrumentos;

import serenata.Instrumento;

public class Tambor extends Instrumento{
    
    @Override
    public void nombrar() {
        setNombre("tambor");
    }
    @Override
    public void afinar() {
        System.out.println("* afinando tambor");
    }

    @Override
    public void tocar() {
        System.out.println("* tocando tambor");
    }    
}
