package modelos;

import java.util.ArrayList;

public class Profesor extends Persona {
    public String codigo;
    public InformacionAdicionalProfesor info;
    public ArrayList<Paralelo> paralelos;

    public Profesor(String codigo) {
        super();
        this.codigo = codigo;
        paralelos= new ArrayList<>();
    }
    
    public void anadirParalelos(Paralelo p){
        paralelos.add(p);
    }
    
    
}
