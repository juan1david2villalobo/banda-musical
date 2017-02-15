package tiposdeinstrumentos;

import serenata.Instrumento;

public class Flauta extends Instrumento {

    @Override
    public void nombrar() {
        setNombre("flauta");
    }

    @Override
    public void afinar() {
        System.out.println("* afinando flauta");
    }

    @Override
    public void tocar() {
        System.out.println("* tocando flauta");
    }
}
