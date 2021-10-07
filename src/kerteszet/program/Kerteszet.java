
package kerteszet.program;

import java.util.ArrayList;

public class Kerteszet {
    
    private ArrayList<Noveny> novenyLista;
    
    public Kerteszet() {
        
        novenyLista = new ArrayList<>();
        
        novenyLista.add(new Noveny("Muskátli"));
        novenyLista.add(new Noveny("Rózsabokor"));
        novenyLista.add(new Noveny("Borostyán"));
        novenyLista.add(new Fa("Citrom fa", 3));
        novenyLista.add(new Fa("Fenyő fa", 8));
    }

    public void elad() {
        
        
    }
    
    
    
    @Override
    public String toString() {
        
        String ki = "";
        for (Noveny noveny : novenyLista) {
            ki += noveny + "\n";
        }
        return ki;
    }
}
