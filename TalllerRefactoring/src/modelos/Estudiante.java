package modelos;

import java.util.ArrayList;

public class Estudiante extends Persona{
    public String matricula;
    public String facultad;
    public ArrayList<Paralelo> paralelos;
    

    public Estudiante(String matricula, String facultad, ArrayList<Paralelo> paralelos) {
        this.matricula = matricula;
        this.facultad = facultad;
        this.paralelos = paralelos;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    public double CalcularNotaParcial(Paralelo p, double nexamen,double ndeberes, double nlecciones, double ntalleres){
        double notaParcial=0;
        for(Paralelo par:paralelos){
            if(p.equals(par)){
                double notaTeorico=(nexamen+ndeberes+nlecciones)*0.80;
                double notaPractico=(ntalleres)*0.20;
                notaParcial=notaTeorico+notaPractico;
            }
        }
        return notaParcial;
    }
    
    //Calcula y devuelve la nota inicial contando examen, deberes, lecciones y talleres. Esta nota es solo el promedio de las dos calificaciones anteriores.
    public double CalcularNotaTotal(Paralelo p){
        double notaTotal=0;
        for(Paralelo par:paralelos){
            if(p.equals(par)){
                notaTotal=(p.getMateria().getNotaTotal());
                
            }
        }
        return notaTotal;
        
    }
}
        
    
    
    
            
        
        
