package serenata;

import java.util.*;
import tiposdeinstrumentos.*;

public class Serenata {

    private final ArrayList<Mariachi> serenata = new ArrayList<>();
        
    public ArrayList<Mariachi> getOrganizacion() {
        return serenata;
    }

    public void crearOrganizacion() {

        Random aleatorio = new Random();
        
        for (int i = 0; i < (aleatorio.nextInt(11) + 10); i++) {
            
            String cantidad = "";
            
            for (int j = 0; j < 10; j++) {
                cantidad +=Integer.toString(aleatorio.nextInt(10));
            }

            Mariachi mariachi = new Mariachi(cantidad);
            mariachi.setMyInstrumento(darInstrumento(aleatorio.nextInt(7)));
            serenata.add(mariachi);
        }
    }

    public Instrumento darInstrumento(int opcion){
        switch(opcion){
            case 0: return new Guitarra();
            case 1: return new Flauta();
            case 2: return new Maracas();
            case 3: return new Violin();
            case 4: return new Bajo();
            case 5: return new Tambor();
            default: return new Trompeta();
        }
    }
}