package main;

import java.util.ArrayList;
import serenata.*;

public class main {
    public static void main(String[] args) {
        
        Serenata organizacion = new Serenata();
        organizacion.crearOrganizacion();
        
        ArrayList<Mariachi> musico = organizacion.getOrganizacion();
        int i = 1;
        for (Mariachi next : musico) {
            next.mostrarMariachi(i);
            i++;
        }
    }    
}
