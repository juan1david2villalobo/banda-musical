package tiposdeinstrumentos;

import serenata.Instrumento;

public class Maracas extends Instrumento {

    @Override
    public void nombrar() {
        setNombre("maracas");
    }

    @Override
    public void afinar() {
        System.out.println("* afinando maracas");
    }

    @Override
    public void tocar() {
        System.out.println("* tocando maracas");
    }
}
