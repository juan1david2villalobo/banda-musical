package serenata;

public abstract class Instrumento {
   private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
   
   public abstract void nombrar();
   public abstract void afinar();
   public abstract void tocar();
}
