package serenata;

public class Mariachi {

    private Instrumento myInstrumento;
    private final String identificacion;

    public Mariachi(String identificacion) {
        this.identificacion = identificacion;
    }

    public void setMyInstrumento(Instrumento myInstrumento) {
        this.myInstrumento = myInstrumento;
    }
    
    public void nombrarInstrumento(Instrumento myInstrumento) {
        myInstrumento.nombrar();
        System.out.println("* instrumento: " + myInstrumento.getNombre());
    }

    public void afinarInstrumento(Instrumento myInstrumento) {
        myInstrumento.afinar();
    }

    public void tocarInstrumento(Instrumento myInstrumento) {
        myInstrumento.tocar();
    }

    public void mostrarMariachi(int i) {
        System.out.println("\nMariachi N° " + i);
        System.out.println("* id del mariachi: " + identificacion);
        nombrarInstrumento(myInstrumento);
        afinarInstrumento(myInstrumento);
        tocarInstrumento(myInstrumento);
    }
}
