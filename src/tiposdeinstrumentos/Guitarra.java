package tiposdeinstrumentos;

import serenata.Instrumento;

public class Guitarra extends Instrumento {
   
    @Override
    public void nombrar() {
        setNombre("guitarra");
    }
    
    @Override
    public void afinar() {
        System.out.println("* afinando guitarra");
    }

    @Override
    public void tocar() {
        System.out.println("* tocando guitarra");
    }
}
