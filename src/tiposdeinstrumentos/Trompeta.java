package tiposdeinstrumentos;

import serenata.Instrumento;

public class Trompeta extends Instrumento {

    @Override
    public void nombrar() {
        setNombre("trompeta");
    }

    @Override
    public void afinar() {
        System.out.println("* afinando trompeta");
    }

    @Override
    public void tocar() {
        System.out.println("* tocando trompeta");
    }
}
