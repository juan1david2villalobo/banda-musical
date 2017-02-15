package tiposdeinstrumentos;

import serenata.Instrumento;

public class Violin extends Instrumento {

    @Override
    public void nombrar() {
        setNombre("violin");
    }

    @Override
    public void afinar() {
        System.out.println("* afinando violin");
    }

    @Override
    public void tocar() {
        System.out.println("* tocando violin");
    }
}
